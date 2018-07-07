package com.youtube.dryrun.testmvparchitecture.data.db.model;

import com.youtube.dryrun.testmvparchitecture.data.DataManager;
import com.youtube.dryrun.testmvparchitecture.data.DataManager.LoggedInMode;

public class User {

    private String email;
    private String password;
    private LoggedInMode loggedInMode;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", loggedInMode=" + loggedInMode +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
