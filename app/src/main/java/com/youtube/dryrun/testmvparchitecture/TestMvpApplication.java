package com.youtube.dryrun.testmvparchitecture;

import android.app.Application;

import com.youtube.dryrun.testmvparchitecture.di.component.ApplicationComponent;
import com.youtube.dryrun.testmvparchitecture.di.component.DaggerApplicationComponent;
import com.youtube.dryrun.testmvparchitecture.di.module.ApplicationModule;

public class TestMvpApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }
}
