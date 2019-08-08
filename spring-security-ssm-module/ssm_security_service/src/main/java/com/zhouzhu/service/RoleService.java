package com.zhouzhu.service;

import com.zhouzhu.pojo.Permission;
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

    Role findById(String roleId);

    List<Permission> findOtherPermission(String roleId);

    void addPermissionToRole(String roleId, String[] permissionIds);
}
