package com.zhouzhu.mapper;

import com.zhouzhu.pojo.Permission;
import com.zhouzhu.pojo.User;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-25 16:05
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

    /**
     * 更新密码
     * @param user
     */
    void updatePassword(User user);

    /**
     * 注册
     * @param user
     */
    void createUser(User user);
}
