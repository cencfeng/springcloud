package com.cen.cloudprovider.provider;

import com.cen.cloudapi.entity.User;
import com.cen.cloudprovider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class UserServiceIpml {
    @Autowired
    UserMapper userMapper;
    @RequestMapping(value = "/getuser")
    public User getUser(String userName){
        System.out.println("impl中的getUser被调用");
        User user = userMapper.getUser(userName);
        System.out.println(userName);
        return user;
    }
}
