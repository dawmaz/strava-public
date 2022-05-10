package com.mrdave19.strava.commons.activity.body;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Map {
    private String id;
    private String polyline;
    private int resource_state;

    private String summary_polyline;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPolyline() {
        return polyline;
    }

    public void setPolyline(String polyline) {
        this.polyline = polyline;
    }

    public int getResource_state() {
        return resource_state;
    }

    public void setResource_state(int resource_state) {
        this.resource_state = resource_state;
    }

    public String getSummary_polyline() {
        return summary_polyline;
    }

    public void setSummary_polyline(String summary_polyline) {
        this.summary_polyline = summary_polyline;
    }
}
