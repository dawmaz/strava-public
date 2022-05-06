package com.mrdave19.strava.controller;

import com.mrdave19.strava.authorization.token.TokenOperator;
import com.mrdave19.strava.authorization.response.ExchangeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

        ExchangeResponse exchangeResponse = tokenOperator.exchangeCodeForTokens(code);
        tokenOperator.persistTokensToDb(exchangeResponse,scope);

        model.addAttribute("text", "Authorization successful!");

        return "simpletext";
    }


}
