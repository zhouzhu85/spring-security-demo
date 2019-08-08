package com.zhouzhu.service;

import com.zhouzhu.pojo.Role;
import com.zhouzhu.pojo.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    List<UserInfo> findAll();

    void save(UserInfo userInfo);

    UserInfo findById(String id);

    List<Role> findOtherRole(String userId);

    void addRoleToUser(String userId, String[] roleIds);
}
