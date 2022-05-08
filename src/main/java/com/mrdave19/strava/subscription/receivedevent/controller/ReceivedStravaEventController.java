package com.mrdave19.strava.subscription.receivedevent.controller;

import com.mrdave19.strava.event.ActivityTypeChanger;
import com.mrdave19.strava.subscription.receivedevent.StravaEventBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class ReceivedStravaEventController {

    @Autowired
    private ActivityTypeChanger activityTypeChanger;

    @PostMapping("/stravaHook")
    public String receivedEvent(@RequestBody StravaEventBody body,
                                Model model){
        activityTypeChanger.process(body);
        return "simpletext";
    }

}
