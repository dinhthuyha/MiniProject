package com.example.apiproject.java.data.repository;

import com.example.apiproject.java.data.base.OnDataLoadedListener;
import com.example.apiproject.java.data.model.FlowerResponse;

import java.util.List;

public interface FlowerRepository {
//    List<FlowerResponse.Hits> getListFlower();
    void getListFLower(OnDataLoadedListener<List<FlowerResponse.Hits>>callback);
}
