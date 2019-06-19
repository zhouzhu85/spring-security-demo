package com.zhouzhu.mapper;

import com.zhouzhu.domain.Permission;
import com.zhouzhu.domain.User;

import java.util.List;

/**
 * @author zhouzhu
 */
public interface UserMapper {
    /**
     * 查询当前用户对象
     * @param username
     * @return
     */
    User findByUsername(String username);

    /**
     * 查询当前用户拥有的权限
     * @param username
     * @return
     */
    List<Permission> findPermissionByUsername(String username);
}
