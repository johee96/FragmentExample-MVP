package com.example.mvptest;

public class FragmentPresenterImpl implements FragmentContract.Presenter{

    private final FragmentContract.View mRestaurantContractView;

    public FragmentPresenterImpl(FragmentContract.View RestaurantContractView) {
        mRestaurantContractView = RestaurantContractView;
        mRestaurantContractView.setPresenter(this);
    }

    @Override
    public void buttonClickAction() {
        mRestaurantContractView.ShowToast("Success");
    }
}
