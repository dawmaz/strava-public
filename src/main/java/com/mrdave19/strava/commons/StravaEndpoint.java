package com.mrdave19.strava.commons;

public enum StravaEndpoint {

    INITIAL_AUTHORIZATION("https://www.strava.com/oauth/authorize"),
    TOKEN_EXCHANGE("https://www.strava.com/api/v3/oauth/token"),
    INITIAL_SUBSCRIPTION("https://www.strava.com/api/v3/push_subscriptions"),
    ACTIVITY("https://www.strava.com/api/v3/activities/");

    private String path;

    private StravaEndpoint(String path){
        this.path = path;
    }

    public String getPath(){
        return path;
    }


}
