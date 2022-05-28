package com.mrdave19.strava.authorization.controller;

import com.mrdave19.strava.commons.StravaApplicationProperties;
import com.mrdave19.strava.commons.StravaAuthorizationRequestParams;
import com.mrdave19.strava.commons.StravaEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class HomepageController {

    @Autowired
    private StravaApplicationProperties properties;

    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("uri",requestAuthorizationString());
        return "home";
    }

    private String requestAuthorizationString(){

        String path = StravaEndpoint.INITIAL_AUTHORIZATION.getPath();

        String tokenUrl = properties.getTokenUrl();
        String clientId = properties.getClientId();



        return UriComponentsBuilder.fromUriString(path)
                .queryParam(StravaAuthorizationRequestParams.RESPONSE_TYPE.getParamName(),"code")
                .queryParam(StravaAuthorizationRequestParams.APPROVAL_PROMPT.getParamName(), "auto")
                .queryParam(StravaAuthorizationRequestParams.REDIRECT_URI.getParamName(),tokenUrl)
                .queryParam(StravaAuthorizationRequestParams.SCOPE.getParamName(),"activity:write,activity:read_all")
                .queryParam(StravaAuthorizationRequestParams.CLIENT_ID.getParamName(),clientId)
                .build()
                .toString();
    }


}
