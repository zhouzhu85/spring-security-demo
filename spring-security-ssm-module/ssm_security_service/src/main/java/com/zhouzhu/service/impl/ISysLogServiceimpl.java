package com.zhouzhu.service.impl;

import com.zhouzhu.dao.ISysLogDao;
import com.zhouzhu.pojo.SysLog;
import com.zhouzhu.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-09 15:10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ISysLogServiceimpl implements ISysLogService {

    @Autowired
    ISysLogDao sysLogDao;

    @Override
    public void save(SysLog sysLog) {
        sysLogDao.save(sysLog);
    }

    @Override
    public List<SysLog> findAll() {
        return sysLogDao.findAll();
    }
}
