package com.mrdave19.strava.subscription.validationcallback.controller;


import com.mrdave19.strava.subscription.create.SubscriptionOperator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(ValidationRequestController.class)
class ValidationRequestControllerTest {

    @Autowired
    ValidationRequestController validationRequestController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads(){
        assertNotNull(validationRequestController);
    }


    @Test
    public void shouldProvideValidResponseWhenTokenVerified() throws Exception {
        String challange = "shouldbereturnedback";

        mockMvc.perform(MockMvcRequestBuilders.get("/stravaHook")
                .param("hub.verify_token", SubscriptionOperator.VERIFY_TOKEN)
                .param("hub.challenge",challange))
           .andExpect(MockMvcResultMatchers.content().json("{\"hub.challenge\" :" +"\""+challange +"\""+ " }" ));
    }

    @Test
    public void shouldProvideNothingWhenTokenIncorrect() throws Exception {
        String challange = "shouldbereturnedback";

        mockMvc.perform(MockMvcRequestBuilders.get("/stravaHook")
                        .param("hub.verify_token", "IncorrectTokenForSure")
                        .param("hub.challenge",challange))
                .andExpect(MockMvcResultMatchers.content().string(""));
    }


}