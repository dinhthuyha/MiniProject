package com.example.apiproject.java.network;

import com.example.apiproject.java.data.model.FlowerResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("api/?key=17879196-53036d227ddd261b2254201a7&q=yellow+flowers&image_type=photo")
    Call<FlowerResponse> getFlower();
}
