package com.mrdave19.strava.subscription.validationcallback;

public class CallbackValidationResponseBody {

    private String hub_challenge;

    public CallbackValidationResponseBody(String hub_challenge) {
        this.hub_challenge = hub_challenge;
    }

    public String getHub_challenge() {
        return hub_challenge;
    }

    public void setHub_challenge(String hub_challenge) {
        this.hub_challenge = hub_challenge;
    }
}




