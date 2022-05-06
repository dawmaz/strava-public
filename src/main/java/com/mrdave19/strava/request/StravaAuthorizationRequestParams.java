package com.mrdave19.strava.request;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum StravaAuthorizationRequestParams {
    RESPONSE_TYPE("response_type"),
    APPROVAL_PROMPT("approval_prompt"),
    CLIENT_ID("client_id"),
    REDIRECT_URI("redirect_uri"),
    SCOPE("scope"),
    CLIENT_SECRET("client_secret"),
    CODE("code"),
    GRANT_TYPE("grant_type"),
    REFRESH_TOKEN("refresh_token"),
    CALLBACK_URL("callback_url"),
    VERIFY_TOKEN("verify_token");


    private String paramName;

    private StravaAuthorizationRequestParams(String paramName){
        this.paramName = paramName;
    }

    public String getParamName(){
        return paramName;
    }

}
