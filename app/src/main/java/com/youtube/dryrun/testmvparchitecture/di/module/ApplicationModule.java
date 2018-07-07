package com.youtube.dryrun.testmvparchitecture.di.module;

import android.app.Application;
import android.content.Context;

import com.youtube.dryrun.testmvparchitecture.data.AppDataManager;
import com.youtube.dryrun.testmvparchitecture.data.DataManager;
import com.youtube.dryrun.testmvparchitecture.data.db.AppDbHelper;
import com.youtube.dryrun.testmvparchitecture.data.db.DbHelper;
import com.youtube.dryrun.testmvparchitecture.data.network.ApiHelper;
import com.youtube.dryrun.testmvparchitecture.data.network.AppApiHelper;
import com.youtube.dryrun.testmvparchitecture.data.prefs.AppPreferenceHelper;
import com.youtube.dryrun.testmvparchitecture.data.prefs.PreferenceHelper;
import com.youtube.dryrun.testmvparchitecture.di.ActivityContext;
import com.youtube.dryrun.testmvparchitecture.di.ApplicationContext;
import com.youtube.dryrun.testmvparchitecture.di.DatabaseInfo;
import com.youtube.dryrun.testmvparchitecture.di.PreferenceInfo;
import com.youtube.dryrun.testmvparchitecture.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Classes annotated with @Module are responsible for providing
 * objects which can be injected. Such classes define methods
 * annotated with @Provides. The returned objects from these
 * methods are available for dependency injection.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return mApplication;
    }

    @Provides
    Application provideApplication(){
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName(){
        return AppConstants.DB_NAME;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName(){
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager){
        return appDataManager;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper){
        return appDbHelper;
    }

    @Provides
    @Singleton
    PreferenceHelper providePreferenceHelper(AppPreferenceHelper appPreferenceHelper){
        return appPreferenceHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper){
        return appApiHelper;
    }








}
