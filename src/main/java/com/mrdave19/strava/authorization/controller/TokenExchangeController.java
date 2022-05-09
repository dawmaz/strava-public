package com.mrdave19.strava.authorization.controller;

import com.mrdave19.strava.authorization.token.TokenOperator;
import com.mrdave19.strava.authorization.response.ExchangeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Controller
public class TokenExchangeController {

    @Autowired
    private TokenOperator tokenOperator;
    @GetMapping("/token")
    public String tokens(@RequestParam(name ="code") String code,
                         @RequestParam(name="scope") String scope,
                         @RequestParam(name="error", required = false) String error,
                         Model model){

        if(error!=null){
            model.addAttribute("error","Your request cannot be processed");
            return "token";
        }

        Webhook.ping("tokenController","About to start exchanging tokens");

        ExchangeResponse exchangeResponse = tokenOperator.exchangeCodeForTokens(code);

        Webhook.ping("tokenController","Tokens exchanged. About to persist data to DB");
        tokenOperator.persistTokensToDb(exchangeResponse,scope);

        model.addAttribute("text", "Authorization successful!");

        return "simpletext";
    }


}
