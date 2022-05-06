package com.mrdave19.strava.subscription.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InitialSubscriptionController {

    @GetMapping("/initialize/subscription")
    public String initializeSubscription(){

        return null;
    }

}
