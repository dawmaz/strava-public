package com.mrdave19.strava.subscription.create;

import com.mrdave19.strava.commons.StravaApplicationProperties;
import com.mrdave19.strava.commons.StravaAuthorizationRequestParams;
import com.mrdave19.strava.commons.StravaEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class SubscriptionOperator {

    private static Logger logger = LoggerFactory.getLogger(SubscriptionOperator.class);

    public static final String VERIFY_TOKEN = "onlyRequestFromStravaWillBeProcessed";

    @Autowired
    StravaApplicationProperties properties;


    public String registerForSubscription(){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(prepareInitialSubscriptionRequestUri())
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

        HttpClient client = HttpClient.newHttpClient();

        String response;
        try {
            HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());
            response=send.body();
        } catch (IOException e) {
            logger.error("Error message related with IOException: {}", e.getMessage());
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            logger.error("Error message related with InterruptedException: {}", e.getMessage());
            throw new RuntimeException(e);
        }
        return response;
    }

    private URI prepareInitialSubscriptionRequestUri(){
        logger.info("Value of endpoint {}", properties.getCallbackUrl());
        return UriComponentsBuilder.fromUriString(StravaEndpoint.INITIAL_SUBSCRIPTION.getPath())
                .queryParam(StravaAuthorizationRequestParams.CLIENT_ID.getParamName(),properties.getClientId())
                .queryParam(StravaAuthorizationRequestParams.CLIENT_SECRET.getParamName(),properties.getClientSecret())
                .queryParam(StravaAuthorizationRequestParams.CALLBACK_URL.getParamName(),properties.getCallbackUrl())
                .queryParam(StravaAuthorizationRequestParams.VERIFY_TOKEN.getParamName(),VERIFY_TOKEN)
                .build()
                .toUri();
    }


}
