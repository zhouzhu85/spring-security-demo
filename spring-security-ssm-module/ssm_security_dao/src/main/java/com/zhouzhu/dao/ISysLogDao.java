package com.zhouzhu.dao;

import com.zhouzhu.pojo.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ISysLogDao {

    @Insert("insert into syslog (visitTime,username,ip,url,executionTime,method) values (#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    void save(SysLog sysLog);

    @Select("select * from sysLog")
    List<SysLog> findAll();
}
