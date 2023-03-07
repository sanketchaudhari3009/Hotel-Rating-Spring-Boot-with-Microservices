package com.Icwd.user.service.services;

import com.Icwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    //create user
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given user id
    User getUser(String userId);

    //TODO: delete
    //TODO: update


}
