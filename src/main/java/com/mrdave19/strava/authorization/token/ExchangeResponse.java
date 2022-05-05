package com.mrdave19.strava.authorization.token;

import java.util.Date;

public class ExchangeResponse {

    private String token_type;
    private long expires_at;
    private long expires_in;
    private String refresh_token;
    private String access_token;
    private Athlete athlete;

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public long getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(long expires_at) {
        this.expires_at = expires_at;
    }

    public long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(long expires_in) {
        this.expires_in = expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }
}

 class Athlete{
     private int id;
     private String username;
     private int resource_state;
     private String firstname;
     private String lastname;
     private String bio;
     private String city;
     private String state;
     private String country;
     private String sex;
     private boolean premium;
     private boolean summit;
     private Date created_at;
     private Date updated_at;
     private int badge_type_id;
     private String weight;
     private String profile_medium;
     private String profile;
     private String friend;
     private String follower;

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getUsername() {
         return username;
     }

     public void setUsername(String username) {
         this.username = username;
     }

     public int getResource_state() {
         return resource_state;
     }

     public void setResource_state(int resource_state) {
         this.resource_state = resource_state;
     }

     public String getFirstname() {
         return firstname;
     }

     public void setFirstname(String firstname) {
         this.firstname = firstname;
     }

     public String getLastname() {
         return lastname;
     }

     public void setLastname(String lastname) {
         this.lastname = lastname;
     }

     public String getBio() {
         return bio;
     }

     public void setBio(String bio) {
         this.bio = bio;
     }

     public String getCity() {
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }

     public String getState() {
         return state;
     }

     public void setState(String state) {
         this.state = state;
     }

     public String getCountry() {
         return country;
     }

     public void setCountry(String country) {
         this.country = country;
     }

     public String getSex() {
         return sex;
     }

     public void setSex(String sex) {
         this.sex = sex;
     }

     public boolean isPremium() {
         return premium;
     }

     public void setPremium(boolean premium) {
         this.premium = premium;
     }

     public boolean isSummit() {
         return summit;
     }

     public void setSummit(boolean summit) {
         this.summit = summit;
     }

     public Date getCreated_at() {
         return created_at;
     }

     public void setCreated_at(Date created_at) {
         this.created_at = created_at;
     }

     public Date getUpdated_at() {
         return updated_at;
     }

     public void setUpdated_at(Date updated_at) {
         this.updated_at = updated_at;
     }

     public int getBadge_type_id() {
         return badge_type_id;
     }

     public void setBadge_type_id(int badge_type_id) {
         this.badge_type_id = badge_type_id;
     }

     public String getWeight() {
         return weight;
     }

     public void setWeight(String weight) {
         this.weight = weight;
     }

     public String getProfile_medium() {
         return profile_medium;
     }

     public void setProfile_medium(String profile_medium) {
         this.profile_medium = profile_medium;
     }

     public String getProfile() {
         return profile;
     }

     public void setProfile(String profile) {
         this.profile = profile;
     }

     public String getFriend() {
         return friend;
     }

     public void setFriend(String friend) {
         this.friend = friend;
     }

     public String getFollower() {
         return follower;
     }

     public void setFollower(String follower) {
         this.follower = follower;
     }
 }
