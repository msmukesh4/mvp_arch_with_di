package com.youtube.dryrun.testmvparchitecture.data;

import android.content.Context;

import com.youtube.dryrun.testmvparchitecture.data.db.DbHelper;
import com.youtube.dryrun.testmvparchitecture.data.db.model.User;
import com.youtube.dryrun.testmvparchitecture.data.network.ApiHelper;
import com.youtube.dryrun.testmvparchitecture.data.prefs.PreferenceHelper;
import com.youtube.dryrun.testmvparchitecture.di.ApplicationContext;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * this data helper resolves from where
 * the data should be extracted
 */
@Singleton
public class AppDataManager implements DataManager {

    private static final String TAG = "AppDataManager";
    private final Context context;
    private final DbHelper dbHelper;
    private final ApiHelper apiHelper;
    private final PreferenceHelper preferenceHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context,
                          DbHelper dbHelper, ApiHelper apiHelper,
                          PreferenceHelper preferenceHelper) {
        this.context = context;
        this.dbHelper = dbHelper;
        this.apiHelper = apiHelper;
        this.preferenceHelper = preferenceHelper;
    }

    @Override
    public void setUserAsLoggerOut() {

    }

    @Override
    public void updateUserData(User user) {

    }



    @Override
    public Long insertUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUser(String email) {
        return null;
    }
}
