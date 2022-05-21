package com.example.cuisinenepal.retrofit;

import com.example.cuisinenepal.Models.Mainmodel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("fooddata.json")
    Call<List<Mainmodel>> getAllData();

}
