package com.mrdave19.strava.subscription.initial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationRequestController {

    @GetMapping("/testRest")
    public Test test(){
        return new Test("Dawid");
    }



}
