package com.mrdave19.strava.authorization.request;

public enum StravaEndpoint {

    INITIAL_AUTHORIZATION("https://www.strava.com/oauth/authorize"),
    TOKEN_EXCHANGE("https://www.strava.com/api/v3/oauth/token");

    private String path;

    private StravaEndpoint(String path){
        this.path = path;
    }

    public String getPath(){
        return path;
    }


}
