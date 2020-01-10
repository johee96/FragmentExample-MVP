package com.example.mvptest;

public interface BaseView<T> {
    void setPresenter(T presenter);
    void ShowToast(String text);
}
