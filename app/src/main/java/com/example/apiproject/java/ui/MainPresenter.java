package com.example.apiproject.java.ui;

import android.util.Log;

import com.example.apiproject.java.data.base.OnDataLoadedListener;
import com.example.apiproject.java.data.model.FlowerResponse;
import com.example.apiproject.java.data.repository.FlowerRepository;

import java.util.ArrayList;
import java.util.List;

public class MainPresenter implements MainContract.Persenter {

    private MainContract.View view;
    private FlowerRepository repository;

    public MainPresenter(MainContract.View view, FlowerRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    @Override
    public void handle() {


        //chuyen du lieu len view
        List<FlowerResponse.Hits> list = new ArrayList<>();

        Log.d("Main", "handle: "+list.size());
        repository.getListFLower(new OnDataLoadedListener<List<FlowerResponse.Hits>>() {
            @Override
            public void onSuccess(List<FlowerResponse.Hits> data) {
                view.updateView(data);
                Log.d("presenter", "onSuccess: "+ data.size());
            }

            @Override
            public void onFailure(String exception) {

            }
        });
//        view.updateView( repository.getListFlower());
    }
}
