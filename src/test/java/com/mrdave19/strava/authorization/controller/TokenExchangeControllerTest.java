package com.mrdave19.strava.authorization.controller;

import com.mrdave19.strava.authorization.token.TokenOperator;
import com.mrdave19.strava.authorization.token.response.ExchangeResponse;
import com.mrdave19.strava.commons.StravaEndpoint;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;


@WebMvcTest(TokenExchangeController.class)
class TokenExchangeControllerTest {

    @Autowired
    TokenExchangeController tokenExchangeController;

    @MockBean
    TokenOperator tokenOperator;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads(){
        assertNotNull(tokenExchangeController);
    }

    @Test
    public void shouldReturnErrorMessageWhenErrorParamExist() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/token")
                        .param("error","An error occured")
                        .param("code","code")
                        .param("scope","scope"))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Your request cannot be processed")));

    }

    @Test
    public void shouldReturnConfirmationMessageWhenNoError() throws Exception {
        ExchangeResponse response = prepareMockExchange();
        Mockito.when(tokenOperator.exchangeCodeForTokens(Mockito.anyString())).thenReturn(response);
        Mockito.when(tokenOperator.persistTokensToDb(Mockito.any(),Mockito.anyString())).thenReturn(true);


        mockMvc.perform(MockMvcRequestBuilders.get("/token")
                        .param("code","code")
                        .param("scope","scope"))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Authorization successful!")));
    }

    private ExchangeResponse prepareMockExchange(){
        ExchangeResponse response = new ExchangeResponse();

        ExchangeResponse.Athlete athlete = new ExchangeResponse().new Athlete();
        athlete.setId(123456);

        response.setAccess_token("access_token");
        response.setRefresh_token("refresh_token");
        response.setAthlete(athlete);

        return response;
    }


}