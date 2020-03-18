package com.shier.dubbo.service;

import com.shier.dubbo.model.User;

public interface UserService {
    String addUser(User user);

    String updateUser(User user1, User user2);
}
