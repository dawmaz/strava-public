package com.mrdave19.strava.subscription.initial.controller;

import com.mrdave19.strava.subscription.initial.SubscriptionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.net.UnknownHostException;

@Controller
public class InitialSubscriptionController {

    @Autowired
    SubscriptionOperator subscriptionOperator;
    @GetMapping("/initialize/subscription")
    public String initializeSubscription(Model model) throws UnknownHostException {

        subscriptionOperator.registerForSubscription();
        model.addAttribute("text","Request to Strava Subscription successful");
        return "simpletext";
    }

}
