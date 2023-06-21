package com.chc.springboot.entity.bean;

import lombok.Data;

@Data
public class User {
    private String id;
    private String userName;
    private String password;
    private String phone;
    private Integer age;
    private Integer gender;
}
