package com.cen.cloudprovider.controller;

import com.cen.cloudapi.entity.User;
import com.cen.cloudapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${server.port}")
    String port;
    @Autowired
    UserService userService;
    @RequestMapping("/user/getuser")
    public String getUser(String userName, String passWord){
        User user = userService.getUser(userName);
        return user.getUsername() + user.getPassword() + port;
    }
}
