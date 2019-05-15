package com.cen.cloudribbon.controller;

import com.cen.cloudapi.entity.User;
import com.cen.cloudapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getuser")
    public User getUser1(String userName){
        return userService.getUser(userName);
    }
    //区分路由分配
    @GetMapping("/user2/getuser")
    public User getUser2(String userName){
        return userService.getUser(userName);
    }

}
