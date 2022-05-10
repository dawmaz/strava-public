package com.mrdave19.strava.commons.activity.body;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trend {
    private ArrayList<Object> speeds;
    private Object current_activity_index;
    private int min_speed;
    private int mid_speed;
    private int max_speed;
    private int direction;

    public ArrayList<Object> getSpeeds() {
        return speeds;
    }

    public void setSpeeds(ArrayList<Object> speeds) {
        this.speeds = speeds;
    }

    public Object getCurrent_activity_index() {
        return current_activity_index;
    }

    public void setCurrent_activity_index(Object current_activity_index) {
        this.current_activity_index = current_activity_index;
    }

    public int getMin_speed() {
        return min_speed;
    }

    public void setMin_speed(int min_speed) {
        this.min_speed = min_speed;
    }

    public int getMid_speed() {
        return mid_speed;
    }

    public void setMid_speed(int mid_speed) {
        this.mid_speed = mid_speed;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
