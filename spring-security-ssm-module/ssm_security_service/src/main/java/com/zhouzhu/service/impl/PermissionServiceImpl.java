package com.zhouzhu.service.impl;

import com.zhouzhu.dao.IPermissionDao;
import com.zhouzhu.dao.IRoleDao;
import com.zhouzhu.pojo.Permission;
import com.zhouzhu.pojo.Role;
import com.zhouzhu.service.PermissionService;
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
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private IPermissionDao permissionDao;

    @Override
    public List<Permission> findAll() {
        return permissionDao.findAll();
    }

    @Override
    public void save(Permission permission) {
        permissionDao.save(permission);
    }
}
