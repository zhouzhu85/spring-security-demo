package com.zhouzhu.dao;

import com.zhouzhu.pojo.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-07 11:24
 */
public interface IPermission {

    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{id})")
    List<Permission> findPermissionByRoleId(String id);

}
