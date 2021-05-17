package com.example.apiproject.java.data.base;

public interface OnDataLoadedListener<T> {
    void onSuccess(T data);

    void onFailure(String exception);
}
