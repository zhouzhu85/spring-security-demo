package com.zhouzhu.service;

import com.zhouzhu.pojo.Permission;
import com.zhouzhu.pojo.Role;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-07 14:59
 */
public interface PermissionService {

    List<Permission> findAll();

    void save(Permission permission);
}
