package com.mrdave19.strava.subscription.receivedevent.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReceivedStravaEventControllerTest {

    @Autowired
    ReceivedStravaEventController receivedStravaEventController;

    @Test
    public void contextLoads(){
        assertNotNull(receivedStravaEventController);
    }



}