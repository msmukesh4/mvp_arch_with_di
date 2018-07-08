package com.youtube.dryrun.testmvparchitecture.di.module;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.youtube.dryrun.testmvparchitecture.di.ActivityContext;
import com.youtube.dryrun.testmvparchitecture.di.PerActivity;
import com.youtube.dryrun.testmvparchitecture.ui.home.HomeMvpPresenter;
import com.youtube.dryrun.testmvparchitecture.ui.home.HomeMvpView;
import com.youtube.dryrun.testmvparchitecture.ui.home.HomePresenter;
import com.youtube.dryrun.testmvparchitecture.ui.login.LoginMvpPresenter;
import com.youtube.dryrun.testmvparchitecture.ui.login.LoginMvpView;
import com.youtube.dryrun.testmvparchitecture.ui.login.LoginPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity(){
        return mActivity;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    HomeMvpPresenter<HomeMvpView> provideHomePresenter(
            HomePresenter<HomeMvpView> presenter) {
        return presenter;
    }
}
