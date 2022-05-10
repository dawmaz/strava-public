package com.mrdave19.strava.commons.activity.body;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SplitsStandard {

    private double distance;
    private int elapsed_time;
    private double elevation_difference;
    private int moving_time;
    private int split;
    private double average_speed;
    private double average_grade_adjusted_speed;
    private int pace_zone;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getElapsed_time() {
        return elapsed_time;
    }

    public void setElapsed_time(int elapsed_time) {
        this.elapsed_time = elapsed_time;
    }

    public double getElevation_difference() {
        return elevation_difference;
    }

    public void setElevation_difference(double elevation_difference) {
        this.elevation_difference = elevation_difference;
    }

    public int getMoving_time() {
        return moving_time;
    }

    public void setMoving_time(int moving_time) {
        this.moving_time = moving_time;
    }

    public int getSplit() {
        return split;
    }

    public void setSplit(int split) {
        this.split = split;
    }

    public double getAverage_speed() {
        return average_speed;
    }

    public void setAverage_speed(double average_speed) {
        this.average_speed = average_speed;
    }

    public double getAverage_grade_adjusted_speed() {
        return average_grade_adjusted_speed;
    }

    public void setAverage_grade_adjusted_speed(double average_grade_adjusted_speed) {
        this.average_grade_adjusted_speed = average_grade_adjusted_speed;
    }

    public int getPace_zone() {
        return pace_zone;
    }

    public void setPace_zone(int pace_zone) {
        this.pace_zone = pace_zone;
    }
}
