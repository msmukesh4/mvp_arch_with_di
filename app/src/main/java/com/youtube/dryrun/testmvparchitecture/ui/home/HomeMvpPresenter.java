package com.youtube.dryrun.testmvparchitecture.ui.home;

import com.youtube.dryrun.testmvparchitecture.ui.base.MvpPresenter;
import com.youtube.dryrun.testmvparchitecture.ui.base.MvpView;

public interface HomeMvpPresenter<V extends MvpView> extends MvpPresenter<V> {

    void attemptLogout();

}
