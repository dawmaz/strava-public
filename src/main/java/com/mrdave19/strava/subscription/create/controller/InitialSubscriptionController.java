package com.mrdave19.strava.subscription.create.controller;

import com.mrdave19.strava.authorization.controller.Webhook;
import com.mrdave19.strava.subscription.create.SubscriptionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class InitialSubscriptionController {

    @Autowired
    SubscriptionOperator subscriptionOperator;
    @GetMapping("/initialize/subscription")
    public String initializeSubscription(Model model) throws UnknownHostException {

        Webhook.ping("initSub","About to register for a sub.");
        subscriptionOperator.registerForSubscription();
        model.addAttribute("text","Request to Strava Subscription successful with hostname: " + InetAddress.getLocalHost().getHostName());
        return "simpletext";
    }

}
