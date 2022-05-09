package com.mrdave19.strava.authorization.controller;

import com.mrdave19.strava.commons.StravaAuthorizationRequestParams;
import com.mrdave19.strava.commons.StravaEndpoint;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class HomepageController {

    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("uri",requestAuthorizationString());
        return "home";
    }

    private String requestAuthorizationString(){

        String path = StravaEndpoint.INITIAL_AUTHORIZATION.getPath();

        String hostname = "http://strava-appka.azurewebsites.net/";
        //String hostname = "http://localhost:8080/";


        return UriComponentsBuilder.fromUriString(path)
                .queryParam(StravaAuthorizationRequestParams.RESPONSE_TYPE.getParamName(),"code")
                .queryParam(StravaAuthorizationRequestParams.APPROVAL_PROMPT.getParamName(), "auto")
                .queryParam(StravaAuthorizationRequestParams.REDIRECT_URI.getParamName(),hostname + "token")
                .queryParam(StravaAuthorizationRequestParams.SCOPE.getParamName(),"activity:write,activity:read_all")
                .queryParam(StravaAuthorizationRequestParams.CLIENT_ID.getParamName(),"83515")
                .build()
                .toString();
    }


}
