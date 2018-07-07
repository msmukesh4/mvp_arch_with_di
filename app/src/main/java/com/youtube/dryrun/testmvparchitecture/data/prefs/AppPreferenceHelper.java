package com.youtube.dryrun.testmvparchitecture.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.youtube.dryrun.testmvparchitecture.di.ApplicationContext;
import com.youtube.dryrun.testmvparchitecture.di.PreferenceInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppPreferenceHelper implements PreferenceHelper {

    private final SharedPreferences mPrefs;

    @Inject
    public AppPreferenceHelper(@ApplicationContext Context context,
                                @PreferenceInfo String prefFileName) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }

}
