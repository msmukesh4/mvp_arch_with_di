package com.youtube.dryrun.testmvparchitecture.data;


import com.youtube.dryrun.testmvparchitecture.data.db.DbHelper;
import com.youtube.dryrun.testmvparchitecture.data.db.model.User;
import com.youtube.dryrun.testmvparchitecture.data.network.ApiHelper;
import com.youtube.dryrun.testmvparchitecture.data.prefs.PreferenceHelper;


public interface DataManager extends DbHelper, PreferenceHelper, ApiHelper{

    void setUserAsLoggerOut();

    void updateUserData(User user);

    enum LoggedInMode {

        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_GOOGLE(1),
        LOGGED_IN_MODE_FACEBOOK(2),
        LOGGED_IN_MODE_SERVER(3);

        private final int mType;

        LoggedInMode(int type) {
            mType = type;
        }

        public int getType(){
            return mType;
        }
    }

}
