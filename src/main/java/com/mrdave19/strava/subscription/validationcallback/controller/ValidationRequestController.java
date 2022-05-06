package com.mrdave19.strava.subscription.validationcallback.controller;

import com.mrdave19.strava.subscription.create.SubscriptionOperator;
import com.mrdave19.strava.subscription.validationcallback.CallbackValidationResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationRequestController {

    @GetMapping("/stravaHook")
    public CallbackValidationResponseBody validateCallback(@RequestParam(name="hub_verify_token") String verifyToken,
                                                           @RequestParam(name="hub_challenge") String hubChallenge){

        if(!verifyToken.equals(SubscriptionOperator.VERIFY_TOKEN))
            return null;

        return new CallbackValidationResponseBody(hubChallenge);
    }



}
