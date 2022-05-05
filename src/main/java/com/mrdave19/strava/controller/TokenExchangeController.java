package com.mrdave19.strava.controller;

import com.mrdave19.strava.authorization.token.TokenOperator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpResponse;

@Controller
public class TokenExchangeController {

    @GetMapping("/token")
    public String tokens(@RequestParam(name ="code") String code,
                         @RequestParam(name="scope") String scope,
                         @RequestParam(name="error", required = false) String error,
                         Model model){


        model.addAttribute("code",code);
        model.addAttribute("scope",scope);
        model.addAttribute("error",error);

        HttpResponse<String> response = TokenOperator.exchangeCodeForTokens(code);
        model.addAttribute("response",response.body());


        return "home";
    }


}
