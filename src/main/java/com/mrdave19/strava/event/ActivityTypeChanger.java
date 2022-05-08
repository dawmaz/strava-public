package com.mrdave19.strava.event;

import com.mrdave19.strava.authorization.token.TokenOperator;
import com.mrdave19.strava.commons.StravaEndpoint;
import com.mrdave19.strava.commons.activity.ActivityProvider;
import com.mrdave19.strava.commons.activity.body.ActivityResponseBody;
import com.mrdave19.strava.subscription.receivedevent.StravaEventBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class ActivityTypeChanger {

    @Autowired
    private ActivityProvider activityProvider;
    @Autowired
    private TokenOperator tokenOperator;

    private ExecutorService executorService = Executors.newCachedThreadPool();

    public void process(StravaEventBody body){
        executorService.submit(()->processActivity(body));
    }

    private void processActivity(StravaEventBody body){
        boolean isNewActivity = body.getObject_type().equals("activity") && body.getAspect_type().equals("create");

        if(isNewActivity){
            ActivityResponseBody activityResponseBody = activityProvider.provideActivity(body.getObject_id(), body.getOwner_id());

            if(activityResponseBody.getType().equals("Run")){
                String token = tokenOperator.retrieveToken(body.getOwner_id());
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(prepareActivityUri(body.getObject_id()))
                        .header("Authorization","Bearer " + token)
                        .header("Content-Type","application/json")
                        .PUT(HttpRequest.BodyPublishers.ofString("{\"type\": \"InlineSkate\"}"))
                        .build();

                HttpClient client = HttpClient.newHttpClient();

                try {
                    HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    private URI prepareActivityUri(long activityId){
        return UriComponentsBuilder.fromUriString(StravaEndpoint.ACTIVITY.getPath())
                .pathSegment(String.valueOf(activityId))
                .build()
                .toUri();
    }

}
