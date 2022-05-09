package com.mrdave19.strava.authorization.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Webhook {

    public static void ping(String whereParamValue, String bodyToAttach){
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://webhook.site/cea2c4b3-f495-4448-9f33-f043aca14782?where=" + whereParamValue))
                    .POST(HttpRequest.BodyPublishers.ofString(bodyToAttach))
                    .build();

            HttpClient client = HttpClient.newHttpClient();

            client.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ping(String whereParamValue, Object bodyToAttach){
        try {

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonBody = objectMapper.writeValueAsString(bodyToAttach);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://webhook.site/cea2c4b3-f495-4448-9f33-f043aca14782?where=" + whereParamValue))
                    .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                    .build();

            HttpClient client = HttpClient.newHttpClient();

            client.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
