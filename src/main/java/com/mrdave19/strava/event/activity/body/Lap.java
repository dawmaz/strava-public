package com.mrdave19.strava.event.activity.body;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Lap {
    private long id;
    private int resource_state;
    private String name;
    private Activity activity;
    private Athlete athlete;
    private int elapsed_time;
    private int moving_time;
    private Date start_date;
    private Date start_date_local;
    private double distance;
    private int start_index;
    private int end_index;
    private int total_elevation_gain;
    private double average_speed;
    private double max_speed;
    private boolean device_watts;
    private double average_heartrate;
    private double max_heartrate;
    private int lap_index;
    private int split;
    private int pace_zone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getResource_state() {
        return resource_state;
    }

    public void setResource_state(int resource_state) {
        this.resource_state = resource_state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public int getElapsed_time() {
        return elapsed_time;
    }

    public void setElapsed_time(int elapsed_time) {
        this.elapsed_time = elapsed_time;
    }

    public int getMoving_time() {
        return moving_time;
    }

    public void setMoving_time(int moving_time) {
        this.moving_time = moving_time;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getStart_date_local() {
        return start_date_local;
    }

    public void setStart_date_local(Date start_date_local) {
        this.start_date_local = start_date_local;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getStart_index() {
        return start_index;
    }

    public void setStart_index(int start_index) {
        this.start_index = start_index;
    }

    public int getEnd_index() {
        return end_index;
    }

    public void setEnd_index(int end_index) {
        this.end_index = end_index;
    }

    public int getTotal_elevation_gain() {
        return total_elevation_gain;
    }

    public void setTotal_elevation_gain(int total_elevation_gain) {
        this.total_elevation_gain = total_elevation_gain;
    }

    public double getAverage_speed() {
        return average_speed;
    }

    public void setAverage_speed(double average_speed) {
        this.average_speed = average_speed;
    }

    public double getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(double max_speed) {
        this.max_speed = max_speed;
    }

    public boolean isDevice_watts() {
        return device_watts;
    }

    public void setDevice_watts(boolean device_watts) {
        this.device_watts = device_watts;
    }

    public double getAverage_heartrate() {
        return average_heartrate;
    }

    public void setAverage_heartrate(double average_heartrate) {
        this.average_heartrate = average_heartrate;
    }

    public double getMax_heartrate() {
        return max_heartrate;
    }

    public void setMax_heartrate(double max_heartrate) {
        this.max_heartrate = max_heartrate;
    }

    public int getLap_index() {
        return lap_index;
    }

    public void setLap_index(int lap_index) {
        this.lap_index = lap_index;
    }

    public int getSplit() {
        return split;
    }

    public void setSplit(int split) {
        this.split = split;
    }

    public int getPace_zone() {
        return pace_zone;
    }

    public void setPace_zone(int pace_zone) {
        this.pace_zone = pace_zone;
    }
}
