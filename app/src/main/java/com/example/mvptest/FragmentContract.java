package com.example.mvptest;


public interface FragmentContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
        void buttonClickAction();
    }
}