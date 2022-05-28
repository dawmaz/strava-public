package com.mrdave19.strava.subscription.create.controller;

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

        String s = subscriptionOperator.registerForSubscription();
        model.addAttribute("text",s);
        return "simpletext";
    }

}
