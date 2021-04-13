package com.gunadarma.soni.surveyapp;

import com.google.firebase.firestore.ServerTimestamp;
import com.google.firebase.firestore.GeoPoint;

import java.util.Date;

public class BlogPost extends BlogPostId {

    public String user_id, image_url, desc, category,longitude,latitude,alamat, image_thumb;
    public Date timestamp;

    public BlogPost() {}

    public BlogPost(String user_id, String image_url, String desc, String category, String longitude, String latitude, String alamat, String image_thumb, Date timestamp) {
        this.user_id = user_id;
        this.image_url = image_url;
        this.desc = desc;
        this.category = category;
        this.longitude = longitude;
        this.latitude = latitude;
        this.alamat = alamat;
        this.image_thumb = image_thumb;
        this.timestamp = timestamp;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage_thumb() {
        return image_thumb;
    }

    public void setImage_thumb(String image_thumb) {
        this.image_thumb = image_thumb;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
