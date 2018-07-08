package com.youtube.dryrun.testmvparchitecture.data.db;

import android.content.Context;

import com.youtube.dryrun.testmvparchitecture.data.db.model.User;
import com.youtube.dryrun.testmvparchitecture.di.ActivityContext;
import com.youtube.dryrun.testmvparchitecture.di.ApplicationContext;
import com.youtube.dryrun.testmvparchitecture.di.DatabaseInfo;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDbHelper implements DbHelper {

    @Inject
    public AppDbHelper(@ApplicationContext Context context,
                       @DatabaseInfo String dbName){
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
