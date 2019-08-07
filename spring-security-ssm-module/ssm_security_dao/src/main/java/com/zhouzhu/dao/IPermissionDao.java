package com.zhouzhu.dao;

import com.zhouzhu.pojo.Permission;
import com.zhouzhu.pojo.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-07 11:24
 */
public interface IPermissionDao {

    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{id})")
    List<Permission> findPermissionByRoleId(String id);

    @Select("select * from permission")
    List<Permission> findAll();

    @Insert("insert into permission (permissionName,url) values (#{permissionName},#{url})")
    void save(Permission permission);
}
