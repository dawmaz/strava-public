package com.mrdave19.strava.authorization.token;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrdave19.strava.commons.StravaApplicationProperties;
import com.mrdave19.strava.commons.StravaAuthorizationRequestParams;
import com.mrdave19.strava.commons.StravaEndpoint;
import com.mrdave19.strava.authorization.token.entity.StravaAccessToken;
import com.mrdave19.strava.authorization.token.entity.StravaRefreshToken;
import com.mrdave19.strava.authorization.token.repository.StravaAccessTokenRepository;
import com.mrdave19.strava.authorization.token.repository.StravaRefreshTokenRepository;
import com.mrdave19.strava.authorization.token.response.ExchangeResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



@Component
public class TokenOperator {

    private static Logger logger = LoggerFactory.getLogger(TokenOperator.class);

    @Autowired
    private StravaAccessTokenRepository accessTokenRepository;
    @Autowired
    private StravaRefreshTokenRepository refreshTokenRepository;

    @Autowired
    private StravaApplicationProperties properties;


    public  ExchangeResponse exchangeCodeForTokens(String code){

        HttpRequest request = HttpRequest.newBuilder()
                .uri(prepareExchangeUriString(code))
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

        HttpClient client = HttpClient.newHttpClient();


        ExchangeResponse exchangeResponse;

        try {
            HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());
            exchangeResponse = new ObjectMapper().readValue(send.body(), ExchangeResponse.class);
        } catch(JsonProcessingException e ){
            logger.error("Error message related with JsonProcessingException: {}", e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            logger.error("Error message related with IOException: {}", e.getMessage());
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            logger.error("Error message related with InterruptedException: {}", e.getMessage());
            throw new RuntimeException(e);
        }

            return exchangeResponse;
    }

    public  boolean persistTokensToDb(ExchangeResponse exchangeResponse, String scope){
        try{
            persistAccessToken(exchangeResponse,scope);
            persistRefreshToken(exchangeResponse,scope);
        } catch (Exception e){
            logger.error("Exception while persisting tokens to db: {}", e.getMessage());
            return false;
        }
        return true;
    }

    @Transactional
    public String retrieveToken(long athleteId){

        StravaAccessToken accessToken = accessTokenRepository.getById(athleteId);
        StravaRefreshToken refreshToken = refreshTokenRepository.getById(athleteId);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(prepareRefreshTokensUriString(refreshToken.getRefreshToken()))
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

        HttpClient client = HttpClient.newHttpClient();
        ExchangeResponse exchangeResponse;

        try {
            HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());
            exchangeResponse = new ObjectMapper().readValue(send.body(), ExchangeResponse.class);
        } catch (IOException e) {
            logger.error("Error message related with IOException: {}", e.getMessage());
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            logger.error("Error message related with InterruptedException: {}", e.getMessage());
            throw new RuntimeException(e);
        }

        accessToken.setAccessToken(exchangeResponse.getAccess_token());
        refreshToken.setRefreshToken(exchangeResponse.getRefresh_token());


        accessTokenRepository.save(accessToken);
        refreshTokenRepository.save(refreshToken);

        return accessToken.getAccessToken();
    }

    private void persistAccessToken(ExchangeResponse exchangeResponse, String scope){
        StravaAccessToken accessToken = new StravaAccessToken();
        accessToken.setAccessToken(exchangeResponse.getAccess_token());
        accessToken.setAthleteId(exchangeResponse.getAthlete().getId());
        accessToken.setScope(scope);
        accessToken.setExpiresAt(exchangeResponse.getExpires_at());

        accessTokenRepository.save(accessToken);
    }

    private void persistRefreshToken(ExchangeResponse exchangeResponse, String scope){
        StravaRefreshToken refreshToken = new StravaRefreshToken();
        refreshToken.setRefreshToken(exchangeResponse.getRefresh_token());
        refreshToken.setAthleteId(exchangeResponse.getAthlete().getId());
        refreshToken.setScope(scope);

        refreshTokenRepository.save(refreshToken);
    }


    private  URI prepareExchangeUriString(String code){

        return UriComponentsBuilder.fromUriString(StravaEndpoint.TOKEN_EXCHANGE.getPath())
                .queryParam(StravaAuthorizationRequestParams.CLIENT_ID.getParamName(),properties.getClientId())
                .queryParam(StravaAuthorizationRequestParams.CLIENT_SECRET.getParamName(),properties.getClientSecret())
                .queryParam(StravaAuthorizationRequestParams.CODE.getParamName(),code)
                .queryParam(StravaAuthorizationRequestParams.GRANT_TYPE.getParamName(),"authorization_code")
                .build()
                .toUri();
    }

    private  URI prepareRefreshTokensUriString(String refreshToken){

        return UriComponentsBuilder.fromUriString(StravaEndpoint.TOKEN_EXCHANGE.getPath())
                .queryParam(StravaAuthorizationRequestParams.CLIENT_ID.getParamName(),properties.getClientId())
                .queryParam(StravaAuthorizationRequestParams.CLIENT_SECRET.getParamName(),properties.getClientSecret())
                .queryParam(StravaAuthorizationRequestParams.REFRESH_TOKEN.getParamName(),refreshToken)
                .queryParam(StravaAuthorizationRequestParams.GRANT_TYPE.getParamName(),"refresh_token")
                .build()
                .toUri();
    }



}


