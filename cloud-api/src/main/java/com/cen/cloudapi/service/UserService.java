package com.cen.cloudapi.service;

import com.cen.cloudapi.entity.User;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-provider", url = "localhost:8763", fallback = UserServiceHystric.class )
public interface UserService {

    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    public User getUser(@RequestParam(name = "userName") String userName);

}
