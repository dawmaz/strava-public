package com.mrdave19.strava.commons.activity.body;

public class SimilarActivities {
    private int effort_count;
    private int average_speed;
    private int min_average_speed;
    private int mid_average_speed;
    private int max_average_speed;
    private Object pr_rank;
    private Object frequency_milestone;
    private Trend trend;
    private int resource_state;

    public int getEffort_count() {
        return effort_count;
    }

    public void setEffort_count(int effort_count) {
        this.effort_count = effort_count;
    }

    public int getAverage_speed() {
        return average_speed;
    }

    public void setAverage_speed(int average_speed) {
        this.average_speed = average_speed;
    }

    public int getMin_average_speed() {
        return min_average_speed;
    }

    public void setMin_average_speed(int min_average_speed) {
        this.min_average_speed = min_average_speed;
    }

    public int getMid_average_speed() {
        return mid_average_speed;
    }

    public void setMid_average_speed(int mid_average_speed) {
        this.mid_average_speed = mid_average_speed;
    }

    public int getMax_average_speed() {
        return max_average_speed;
    }

    public void setMax_average_speed(int max_average_speed) {
        this.max_average_speed = max_average_speed;
    }

    public Object getPr_rank() {
        return pr_rank;
    }

    public void setPr_rank(Object pr_rank) {
        this.pr_rank = pr_rank;
    }

    public Object getFrequency_milestone() {
        return frequency_milestone;
    }

    public void setFrequency_milestone(Object frequency_milestone) {
        this.frequency_milestone = frequency_milestone;
    }

    public Trend getTrend() {
        return trend;
    }

    public void setTrend(Trend trend) {
        this.trend = trend;
    }

    public int getResource_state() {
        return resource_state;
    }

    public void setResource_state(int resource_state) {
        this.resource_state = resource_state;
    }
}
