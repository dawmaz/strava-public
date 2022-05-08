package com.mrdave19.strava.subscription.receivedevent;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StravaEventBody {

    private String aspect_type;
    private long event_time;
    private long object_id;
    private String object_type;
    private long owner_id;
    private int subscription_id;
    private Updates updates;

    public class Updates{
        private String title;
        private String type;
        @JsonProperty("private")
        private boolean myprivate;
        private boolean authorized;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isMyprivate() {
            return myprivate;
        }

        public void setMyprivate(boolean myprivate) {
            this.myprivate = myprivate;
        }

        public boolean isAuthorized() {
            return authorized;
        }

        public void setAuthorized(boolean authorized) {
            this.authorized = authorized;
        }
    }

    public String getAspect_type() {
        return aspect_type;
    }

    public void setAspect_type(String aspect_type) {
        this.aspect_type = aspect_type;
    }

    public long getEvent_time() {
        return event_time;
    }

    public void setEvent_time(long event_time) {
        this.event_time = event_time;
    }

    public long getObject_id() {
        return object_id;
    }

    public void setObject_id(long object_id) {
        this.object_id = object_id;
    }

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type;
    }

    public long getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(long owner_id) {
        this.owner_id = owner_id;
    }

    public int getSubscription_id() {
        return subscription_id;
    }

    public void setSubscription_id(int subscription_id) {
        this.subscription_id = subscription_id;
    }

    public Updates getUpdates() {
        return updates;
    }

    public void setUpdates(Updates updates) {
        this.updates = updates;
    }
}
