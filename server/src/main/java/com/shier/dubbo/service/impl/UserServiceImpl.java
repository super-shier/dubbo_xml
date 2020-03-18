package com.shier.dubbo.service.impl;

import com.shier.dubbo.model.User;
import com.shier.dubbo.service.UserService;


public class UserServiceImpl implements UserService {
    @Override
    public String addUser(User user) {
        return user.toString();
    }

    @Override
    public String updateUser(User user1, User user2) {
        return user1.toString() + user2.toString();
    }
}
