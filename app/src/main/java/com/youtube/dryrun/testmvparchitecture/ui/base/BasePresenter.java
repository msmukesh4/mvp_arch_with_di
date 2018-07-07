package com.youtube.dryrun.testmvparchitecture.ui.base;

import android.util.Log;

import com.youtube.dryrun.testmvparchitecture.data.DataManager;

import javax.inject.Inject;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private static final String TAG = "BasePresenter";
    private DataManager dataManager;
    private V mMvpView;

    @Inject
    public BasePresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void onDetach() {
        mMvpView = null;
    }

    public boolean isViewAttached() {
        return mMvpView != null;
    }

    public V getMvpView() {
        return mMvpView;
    }

    @Override
    public void handleApiError(String error) {
        Log.e(TAG, "handleApiError: "+error );
    }
}
