package com.thoughtworks.training.xueqing.zuulDemo.client;

import com.thoughtworks.training.xueqing.zuulDemo.dto.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name = "user-service")
public interface UserClient {
    @PostMapping("/users/verifications")
    User verifyToken(String token);
    @PostMapping(value = "/login")
    User login(User user);
}
