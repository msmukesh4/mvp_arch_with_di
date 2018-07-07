package com.youtube.dryrun.testmvparchitecture.data.db;

import com.youtube.dryrun.testmvparchitecture.data.db.model.User;

import java.util.List;

public interface DbHelper {

    Long insertUser(final User user);

    List<User> getAllUsers();

    User getUser(final String email);
}
