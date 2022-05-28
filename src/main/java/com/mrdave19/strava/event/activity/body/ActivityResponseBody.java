package com.mrdave19.strava.event.activity.body;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActivityResponseBody {
    private int resource_state;
    private Athlete athlete;
    private String name;
    private double distance;
    private int moving_time;
    private int elapsed_time;
    private int total_elevation_gain;
    private String type;
    private int workout_type;
    private long id;
    private Date start_date;
    private Date start_date_local;
    private String timezone;
    private double utc_offset;
    private Object location_city;
    private Object location_state;
    private Object location_country;
    private int achievement_count;
    private int kudos_count;
    private int comment_count;
    private int athlete_count;
    private int photo_count;
    private Map map;
    private boolean trainer;
    private boolean commute;
    private boolean manual;
    @JsonProperty("private")
    private boolean myprivate;
    private String visibility;
    private boolean flagged;
    private Object gear_id;
    private ArrayList<Object> start_latlng;
    private ArrayList<Object> end_latlng;
    private double average_speed;
    private double max_speed;
    private boolean has_heartrate;
    private double average_heartrate;
    private double max_heartrate;
    private boolean heartrate_opt_out;
    private boolean display_hide_heartrate_option;
    private long upload_id;
    private String upload_id_str;
    private String external_id;
    private boolean from_accepted_tag;
    private int pr_count;
    private int total_photo_count;
    private boolean has_kudoed;
    private String description;
    private int calories;
    private Object perceived_exertion;
    private Object prefer_perceived_exertion;
    private ArrayList<Object> segment_efforts;
    private ArrayList<Lap> laps;
    private ArrayList<Object> best_efforts;
    private Photos photos;
    private ArrayList<StatsVisibility> stats_visibility;
    private boolean hide_from_home;
    private String embed_token;
    private String private_note;
    private SimilarActivities similar_activities;
    private ArrayList<Object> available_zones;

    private double elev_high;

    private ArrayList<SplitsMetric> splits_metric;
    private ArrayList<SplitsStandard> splits_standard;

    private String device_name;

    public int getResource_state() {
        return resource_state;
    }

    public void setResource_state(int resource_state) {
        this.resource_state = resource_state;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getMoving_time() {
        return moving_time;
    }

    public void setMoving_time(int moving_time) {
        this.moving_time = moving_time;
    }

    public int getElapsed_time() {
        return elapsed_time;
    }

    public void setElapsed_time(int elapsed_time) {
        this.elapsed_time = elapsed_time;
    }

    public int getTotal_elevation_gain() {
        return total_elevation_gain;
    }

    public void setTotal_elevation_gain(int total_elevation_gain) {
        this.total_elevation_gain = total_elevation_gain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWorkout_type() {
        return workout_type;
    }

    public void setWorkout_type(int workout_type) {
        this.workout_type = workout_type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public double getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(double utc_offset) {
        this.utc_offset = utc_offset;
    }

    public Object getLocation_city() {
        return location_city;
    }

    public void setLocation_city(Object location_city) {
        this.location_city = location_city;
    }

    public Object getLocation_state() {
        return location_state;
    }

    public void setLocation_state(Object location_state) {
        this.location_state = location_state;
    }

    public Object getLocation_country() {
        return location_country;
    }

    public void setLocation_country(Object location_country) {
        this.location_country = location_country;
    }

    public int getAchievement_count() {
        return achievement_count;
    }

    public void setAchievement_count(int achievement_count) {
        this.achievement_count = achievement_count;
    }

    public int getKudos_count() {
        return kudos_count;
    }

    public void setKudos_count(int kudos_count) {
        this.kudos_count = kudos_count;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public int getAthlete_count() {
        return athlete_count;
    }

    public void setAthlete_count(int athlete_count) {
        this.athlete_count = athlete_count;
    }

    public int getPhoto_count() {
        return photo_count;
    }

    public void setPhoto_count(int photo_count) {
        this.photo_count = photo_count;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public boolean isTrainer() {
        return trainer;
    }

    public void setTrainer(boolean trainer) {
        this.trainer = trainer;
    }

    public boolean isCommute() {
        return commute;
    }

    public void setCommute(boolean commute) {
        this.commute = commute;
    }

    public boolean isManual() {
        return manual;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public boolean isMyprivate() {
        return myprivate;
    }

    public void setMyprivate(boolean myprivate) {
        this.myprivate = myprivate;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    public Object getGear_id() {
        return gear_id;
    }

    public void setGear_id(Object gear_id) {
        this.gear_id = gear_id;
    }

    public ArrayList<Object> getStart_latlng() {
        return start_latlng;
    }

    public void setStart_latlng(ArrayList<Object> start_latlng) {
        this.start_latlng = start_latlng;
    }

    public ArrayList<Object> getEnd_latlng() {
        return end_latlng;
    }

    public void setEnd_latlng(ArrayList<Object> end_latlng) {
        this.end_latlng = end_latlng;
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

    public boolean isHas_heartrate() {
        return has_heartrate;
    }

    public void setHas_heartrate(boolean has_heartrate) {
        this.has_heartrate = has_heartrate;
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

    public boolean isHeartrate_opt_out() {
        return heartrate_opt_out;
    }

    public void setHeartrate_opt_out(boolean heartrate_opt_out) {
        this.heartrate_opt_out = heartrate_opt_out;
    }

    public boolean isDisplay_hide_heartrate_option() {
        return display_hide_heartrate_option;
    }

    public void setDisplay_hide_heartrate_option(boolean display_hide_heartrate_option) {
        this.display_hide_heartrate_option = display_hide_heartrate_option;
    }

    public long getUpload_id() {
        return upload_id;
    }

    public void setUpload_id(long upload_id) {
        this.upload_id = upload_id;
    }

    public String getUpload_id_str() {
        return upload_id_str;
    }

    public void setUpload_id_str(String upload_id_str) {
        this.upload_id_str = upload_id_str;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public boolean isFrom_accepted_tag() {
        return from_accepted_tag;
    }

    public void setFrom_accepted_tag(boolean from_accepted_tag) {
        this.from_accepted_tag = from_accepted_tag;
    }

    public int getPr_count() {
        return pr_count;
    }

    public void setPr_count(int pr_count) {
        this.pr_count = pr_count;
    }

    public int getTotal_photo_count() {
        return total_photo_count;
    }

    public void setTotal_photo_count(int total_photo_count) {
        this.total_photo_count = total_photo_count;
    }

    public boolean isHas_kudoed() {
        return has_kudoed;
    }

    public void setHas_kudoed(boolean has_kudoed) {
        this.has_kudoed = has_kudoed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Object getPerceived_exertion() {
        return perceived_exertion;
    }

    public void setPerceived_exertion(Object perceived_exertion) {
        this.perceived_exertion = perceived_exertion;
    }

    public Object getPrefer_perceived_exertion() {
        return prefer_perceived_exertion;
    }

    public void setPrefer_perceived_exertion(Object prefer_perceived_exertion) {
        this.prefer_perceived_exertion = prefer_perceived_exertion;
    }

    public ArrayList<Object> getSegment_efforts() {
        return segment_efforts;
    }

    public void setSegment_efforts(ArrayList<Object> segment_efforts) {
        this.segment_efforts = segment_efforts;
    }

    public ArrayList<Lap> getLaps() {
        return laps;
    }

    public void setLaps(ArrayList<Lap> laps) {
        this.laps = laps;
    }

    public ArrayList<Object> getBest_efforts() {
        return best_efforts;
    }

    public void setBest_efforts(ArrayList<Object> best_efforts) {
        this.best_efforts = best_efforts;
    }

    public Photos getPhotos() {
        return photos;
    }

    public void setPhotos(Photos photos) {
        this.photos = photos;
    }

    public ArrayList<StatsVisibility> getStats_visibility() {
        return stats_visibility;
    }

    public void setStats_visibility(ArrayList<StatsVisibility> stats_visibility) {
        this.stats_visibility = stats_visibility;
    }

    public boolean isHide_from_home() {
        return hide_from_home;
    }

    public void setHide_from_home(boolean hide_from_home) {
        this.hide_from_home = hide_from_home;
    }

    public String getEmbed_token() {
        return embed_token;
    }

    public void setEmbed_token(String embed_token) {
        this.embed_token = embed_token;
    }

    public String getPrivate_note() {
        return private_note;
    }

    public void setPrivate_note(String private_note) {
        this.private_note = private_note;
    }

    public SimilarActivities getSimilar_activities() {
        return similar_activities;
    }

    public void setSimilar_activities(SimilarActivities similar_activities) {
        this.similar_activities = similar_activities;
    }

    public ArrayList<Object> getAvailable_zones() {
        return available_zones;
    }

    public void setAvailable_zones(ArrayList<Object> available_zones) {
        this.available_zones = available_zones;
    }

    public double getElev_high() {
        return elev_high;
    }

    public void setElev_high(double elev_high) {
        this.elev_high = elev_high;
    }

    public ArrayList<SplitsMetric> getSplits_metric() {
        return splits_metric;
    }

    public void setSplits_metric(ArrayList<SplitsMetric> splits_metric) {
        this.splits_metric = splits_metric;
    }

    public ArrayList<SplitsStandard> getSplits_standard() {
        return splits_standard;
    }

    public void setSplits_standard(ArrayList<SplitsStandard> splits_standard) {
        this.splits_standard = splits_standard;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }
}
