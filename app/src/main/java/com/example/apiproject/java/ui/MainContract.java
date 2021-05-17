package com.example.apiproject.java.ui;

import com.example.apiproject.java.data.model.FlowerResponse;

import java.util.List;

public interface MainContract {
    interface  View{
        void updateView(List<FlowerResponse.Hits> hits);

    }
    interface Persenter{
        void handle();

    }
}
