package com.zhouzhu.service;

import com.zhouzhu.pojo.Role;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-07 14:59
 */
public interface RoleService {

    List<Role> findAll();

    void save(Role role);
}
