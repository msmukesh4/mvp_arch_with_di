package com.youtube.dryrun.testmvparchitecture.ui.base;

import android.support.annotation.StringRes;

public interface MvpView {

    void showLoading();

    void hideLoading();

    void showMessage(String message);

    void showMessage(@StringRes int message);

    void showError(String error);

    void showError(@StringRes int error);

    void hideKeyboard();

}
