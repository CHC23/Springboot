package com.chc.springboot.controller;

import com.chc.springboot.core.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private UserService userService;

    @GetMapping
    public Object hello(){
        return userService.getAllUsers();
    }

    @GetMapping("get-one")
    public Object getUserById(@RequestParam("userId") String userId){
        return userService.getUserById(userId);
    }
}
