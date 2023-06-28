package com.chc.springboot.controller;

import com.chc.springboot.core.service.UserService;
import com.chc.springboot.entity.Response;
import com.chc.springboot.entity.bean.User;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private UserService userService;

    @GetMapping
    public Response<List<User>> hello(){
        return Response.success(userService.getAllUsers());
    }

    @GetMapping("get-one")
    public Response<User> getUserById(@RequestParam("userId") String userId){
        return Response.success(userService.getUserById(userId));
    }
}
