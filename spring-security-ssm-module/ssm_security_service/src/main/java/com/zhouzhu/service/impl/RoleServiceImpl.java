package com.zhouzhu.service.impl;

import com.zhouzhu.dao.IRoleDao;
import com.zhouzhu.pojo.Permission;
import com.zhouzhu.pojo.Role;
import com.zhouzhu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-07 14:59
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private IRoleDao roleDao;

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }

    @Override
    public void save(Role role) {
        roleDao.save(role);
    }

    @Override
    public Role findById(String roleId) {
        return roleDao.findById(roleId);
    }

    @Override
    public List<Permission> findOtherPermission(String roleId) {
        return roleDao.findOtherPermission(roleId);
    }

    @Override
    public void addPermissionToRole(String roleId, String[] permissionIds) {
        for (String permissionId : permissionIds) {
            roleDao.addPermissionToRole(roleId,permissionId);
        }
    }
}
