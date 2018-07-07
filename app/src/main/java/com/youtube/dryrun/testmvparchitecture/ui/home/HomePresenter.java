package com.youtube.dryrun.testmvparchitecture.ui.home;

import com.youtube.dryrun.testmvparchitecture.R;
import com.youtube.dryrun.testmvparchitecture.data.DataManager;
import com.youtube.dryrun.testmvparchitecture.ui.base.BasePresenter;
import com.youtube.dryrun.testmvparchitecture.utils.AppUtils;

import java.util.Timer;
import java.util.TimerTask;

//public class HomePresenter<V extends HomeMvpView> extends BasePresenter<V>
//        implements HomeMvpPresenter<V> {
//
//
//    public HomePresenter(DataManager dataManager) {
//        super(dataManager);
//    }
//
//    @Override
//    public void attemptLogin(String email, String password) {
//        if (email == null || email.isEmpty()){
//            getMvpView().showError(R.string.err_empty_email);
//            return;
//        }
//
//        if (AppUtils.isEmailValid(email)){
//            getMvpView().showError(R.string.err_invalid_email);
//            return;
//        }
//
//
//        if (password == null || password.isEmpty()){
//            getMvpView().showError(R.string.err_empty_password);
//            return;
//        }
//
//        if (AppUtils.isPasswordValid(password)){
//            getMvpView().showError(R.string.err_invalid_password);
//            return;
//        }
//
//        getMvpView().showLoading();
//
//        // TODO make an api call to server for authentication
//        // then update the UI accordingly
//
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                getMvpView().hideLoading();
//                getMvpView().openMainActivity();
//            }
//        },3000);
//
//    }
//
//    @Override
//    public void onGoogleLoginClick() {
//        getMvpView().showLoading();
//
//        // TODO make an api call to google for authentication
//        // then update the UI accordingly
//
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                getMvpView().hideLoading();
//                getMvpView().openMainActivity();
//            }
//        },3000);
//    }
//
//    @Override
//    public void onFacebookLoginClick() {
//        getMvpView().showLoading();
//
//        // TODO make an api call to facebook for authentication
//        // then update the UI accordingly
//
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                getMvpView().hideLoading();
//                getMvpView().openMainActivity();
//            }
//        },3000);
//    }
//
//}
