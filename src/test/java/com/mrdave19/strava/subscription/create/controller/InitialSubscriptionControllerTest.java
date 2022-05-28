package com.mrdave19.strava.subscription.create.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InitialSubscriptionControllerTest {

    @Autowired
    InitialSubscriptionController initialSubscriptionController;

    @Test
    public void contextLoads(){
        assertNotNull(initialSubscriptionController);
    }
}