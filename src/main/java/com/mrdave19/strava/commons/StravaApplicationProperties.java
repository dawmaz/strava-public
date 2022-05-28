package com.mrdave19.strava.commons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StravaApplicationProperties {

    @Value("${com.mrdave19.strava.clientId}")
    private String clientId;

    @Value("${com.mrdave19.strava.clientSecret}")
    private String clientSecret;

    @Value("${com.mrdave19.strava.callbackUrl}")
    private String callbackUrl;

    @Value("${com.mrdave19.strava.tokenUrl}")
    private String tokenUrl;


    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public String getTokenUrl() {
        return tokenUrl;
    }
}
