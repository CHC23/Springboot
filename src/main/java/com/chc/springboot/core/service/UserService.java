package com.chc.springboot.core.service;

import com.chc.springboot.core.mapper.UserMapper;
import com.chc.springboot.entity.bean.User;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> getAllUsers(){
        return userMapper.selectAll();
    }

    public User getUserById(String userId){
        return userMapper.selectUserById(userId);
    }
}
