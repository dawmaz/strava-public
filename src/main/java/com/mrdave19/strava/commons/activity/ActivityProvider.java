package com.mrdave19.strava.commons.activity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrdave19.strava.authorization.token.TokenOperator;
import com.mrdave19.strava.commons.StravaEndpoint;
import com.mrdave19.strava.commons.activity.body.ActivityResponseBody;
import com.mrdave19.strava.subscription.create.SubscriptionOperator;
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
public class ActivityProvider {

    @Autowired
    TokenOperator tokenOperator;

    private static Logger logger = LoggerFactory.getLogger(SubscriptionOperator.class);

    public ActivityResponseBody provideActivity(long activityId, long athleteId){

        String token = tokenOperator.retrieveToken(athleteId);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(prepareActivityUri(String.valueOf(activityId)))
                .header("Authorization","Bearer " + token)
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();
        ActivityResponseBody activityResponseBody;

        try {
            HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());
            activityResponseBody = new ObjectMapper().readValue(send.body(), ActivityResponseBody.class);
        } catch (IOException e) {
            logger.error("Error message related with IOException: {}", e.getMessage());
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            logger.error("Error message related with InterruptedException: {}", e.getMessage());
            throw new RuntimeException(e);
        }

        return activityResponseBody;
    }

    private URI prepareActivityUri(String segment){
        return UriComponentsBuilder.fromUriString(StravaEndpoint.ACTIVITY.getPath())
                .pathSegment(segment)
                .build()
                .toUri();
    }



}
