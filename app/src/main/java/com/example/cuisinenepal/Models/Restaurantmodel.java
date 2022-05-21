package com.example.cuisinenepal.Models;

import android.widget.ImageView;

public class Restaurantmodel {

    int restuaurantimage;
    String  name, Distance , Loaction , Description;

    public Restaurantmodel(int restuaurantimage, String distance, String loaction, String description) {
        this.restuaurantimage = restuaurantimage;
        Distance = distance;
        Loaction = loaction;
        Description = description;
    }

    public int getRestuaurantimage() {
        return restuaurantimage;
    }

    public void setRestuaurantimage(int restuaurantimage) {
        this.restuaurantimage = restuaurantimage;
    }

    public String getDistance() {
        return Distance;
    }

    public void setDistance(String distance) {
        Distance = distance;
    }

    public String getLoaction() {
        return Loaction;
    }

    public void setLoaction(String loaction) {
        Loaction = loaction;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
