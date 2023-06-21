package com.chc.springboot.core.mapper;

import com.chc.springboot.entity.bean.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {
}
