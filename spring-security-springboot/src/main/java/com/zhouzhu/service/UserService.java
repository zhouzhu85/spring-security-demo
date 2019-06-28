package com.zhouzhu.service;

import com.zhouzhu.mapper.UserMapper;
import com.zhouzhu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-28 15:46
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void createUser(User user){
        user.setId(new Random().nextInt(100000));
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        user.setCreateDate(new Date());
        userMapper.createUser(user);
    }
}
