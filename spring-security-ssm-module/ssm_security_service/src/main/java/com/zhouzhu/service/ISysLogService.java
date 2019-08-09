package com.zhouzhu.service;

import com.zhouzhu.pojo.SysLog;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-09 15:10
 */
public interface ISysLogService {
    void save(SysLog sysLog);

    List<SysLog> findAll();
}
