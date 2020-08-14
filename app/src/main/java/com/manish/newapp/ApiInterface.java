package com.manish.newapp;

import com.manish.newapp.Models.Headlines;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<Headlines> getHeadlines(@Query("sources") String sources, @Query("apiKey") String apiKey);
//    Call<Headlines> getHeadlines(@Query("country") String country, @Query("apiKey") String apiKey);

}
