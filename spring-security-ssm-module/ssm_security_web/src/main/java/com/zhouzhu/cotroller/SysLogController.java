package com.zhouzhu.cotroller;

import com.zhouzhu.pojo.SysLog;
import com.zhouzhu.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-09 16:22
 */
@Controller
@RequestMapping("sysLog")
public class SysLogController {

    @Autowired
    private ISysLogService sysLogService;

    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView=new ModelAndView();
        List<SysLog> logList=sysLogService.findAll();
        modelAndView.addObject("sysLogs",logList);
        modelAndView.setViewName("syslog-list");
        return modelAndView;
    }

}
