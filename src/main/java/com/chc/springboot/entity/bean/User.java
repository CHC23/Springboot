package com.chc.springboot.entity.bean;

import lombok.Data;

import javax.persistence.Id;

@Data
public class User {
    @Id
    private String id;
    private String userName;
    private String password;
    private String phone;
    private Integer age;
    private Integer gender;
}
