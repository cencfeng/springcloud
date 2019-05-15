package com.cen.cloudapi.service;

import com.cen.cloudapi.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystric implements UserService {
    @Override
    public User getUser(String userName) {
        User user = new User();
        user.setUsername("sorry");
        return user;
    }
}
