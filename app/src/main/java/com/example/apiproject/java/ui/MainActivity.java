package com.example.apiproject.java.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.apiproject.R;
import com.example.apiproject.java.data.model.FlowerResponse;
import com.example.apiproject.java.data.repository.FlowerRepository;
import com.example.apiproject.java.data.repository.FlowerRepositoryImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    private static final String TAG = "MainActivity";
    private MainContract.Persenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();

    }

    private void initPresenter() {
        FlowerRepository repository= new FlowerRepositoryImpl();
        presenter= new MainPresenter(this, repository);
        presenter.handle();
    }

    @Override
    public void updateView(List<FlowerResponse.Hits> hits) {
        Log.d(TAG, "updateView: view da duoc cap nhat");
        Log.d(TAG, "updateView: "+hits.size());
    }
}