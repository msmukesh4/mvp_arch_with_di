package com.youtube.dryrun.testmvparchitecture.di.component;

import com.youtube.dryrun.testmvparchitecture.di.PerActivity;
import com.youtube.dryrun.testmvparchitecture.di.module.ActivityModule;
import com.youtube.dryrun.testmvparchitecture.ui.home.HomeActivity;
import com.youtube.dryrun.testmvparchitecture.ui.login.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @PerActivity is a scope and is used to tell the Dagger that
 * the Context and Activity provided by the ActivityModule will
 * be instantiated each time an Activity is created. So, these
 * objects persist till that activity lives and each activity
 * has its own set of these.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(LoginActivity loginActivity);

    void inject(HomeActivity homeActivity);

}
