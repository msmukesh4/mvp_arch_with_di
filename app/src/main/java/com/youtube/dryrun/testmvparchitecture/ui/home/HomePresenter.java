package com.youtube.dryrun.testmvparchitecture.ui.home;

import com.youtube.dryrun.testmvparchitecture.R;
import com.youtube.dryrun.testmvparchitecture.data.DataManager;
import com.youtube.dryrun.testmvparchitecture.ui.base.BasePresenter;
import com.youtube.dryrun.testmvparchitecture.utils.AppUtils;

import java.util.Timer;
import java.util.TimerTask;

import javax.inject.Inject;

public class HomePresenter<V extends HomeMvpView> extends BasePresenter<V>
        implements HomeMvpPresenter<V> {

    @Inject
    public HomePresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void attemptLogout() {

        getMvpView().showLoading();

        // TODO make an api call to server for authentication
        // then update the UI accordingly
        delay();
    }

    private void delay(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                getMvpView().hideLoading();
                getMvpView().openLoginActivity();
            }
        },3000);

    }

}
