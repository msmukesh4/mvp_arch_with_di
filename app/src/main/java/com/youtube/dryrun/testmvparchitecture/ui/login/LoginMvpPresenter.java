package com.youtube.dryrun.testmvparchitecture.ui.login;

import com.youtube.dryrun.testmvparchitecture.ui.base.MvpPresenter;
import com.youtube.dryrun.testmvparchitecture.ui.base.MvpView;

public interface LoginMvpPresenter<V extends MvpView> extends MvpPresenter<V> {

    void attemptLogin(String email, String Password);

    void onGoogleLoginClick();

    void onFacebookLoginClick();

}
