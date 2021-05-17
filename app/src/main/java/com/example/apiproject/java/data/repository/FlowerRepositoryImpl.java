package com.example.apiproject.java.data.repository;

import android.util.Log;

import com.example.apiproject.java.data.base.OnDataLoadedListener;
import com.example.apiproject.java.data.model.FlowerResponse;
import com.example.apiproject.java.network.APIService;
import com.example.apiproject.java.network.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FlowerRepositoryImpl implements FlowerRepository {
    List<FlowerResponse.Hits> list = new ArrayList<>();
    private final APIService apiService = RetrofitClient.getInstance().create(APIService.class);
    private static final String TAG = "FlowerRepositoryImpl";


    @Override
    public void getListFLower(OnDataLoadedListener<List<FlowerResponse.Hits>> callback) {
        apiService.getFlower().enqueue(new Callback<FlowerResponse>() {
            @Override
            public void onResponse(Call<FlowerResponse> call, Response<FlowerResponse> response) {
                if (response.isSuccessful()) {
                    Log.d(TAG, "onResponse: " + response.body().getHits().get(1).getUrl());
                    List<FlowerResponse.Hits> listHits = response.body().getHits();
                    for (FlowerResponse.Hits index : listHits) {
                        list.add(new FlowerResponse.Hits(index.getUrl()));
                        Log.d(TAG, "onResponse: " + index.getUrl());
                    }
                    Log.d(TAG, "repository: "+list.size());
                    callback.onSuccess(list);
                }
            }

            @Override
            public void onFailure(Call<FlowerResponse> call, Throwable t) {
                callback.onFailure(t.getMessage());

            }
        });

    }
}
