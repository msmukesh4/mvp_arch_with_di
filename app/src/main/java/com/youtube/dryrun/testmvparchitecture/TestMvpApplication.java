package com.youtube.dryrun.testmvparchitecture;

import android.app.Application;

import com.youtube.dryrun.testmvparchitecture.di.component.ApplicationComponent;
import com.youtube.dryrun.testmvparchitecture.di.component.DaggerApplicationComponent;
import com.youtube.dryrun.testmvparchitecture.di.module.ApplicationModule;

public class TestMvpApplication extends Application {

    protected ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        mApplicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }
}
