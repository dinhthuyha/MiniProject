package com.example.init.api

import com.example.init.data.model.FlowerResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
   @GET("api/?key=17879196-53036d227ddd261b2254201a7&q=yellow+flowers&image_type=photo")
   fun getFlower(): Call<FlowerResponse>
}