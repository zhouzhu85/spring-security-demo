package com.zhouzhu.cotroller.aop;

import com.zhouzhu.pojo.SysLog;
import com.zhouzhu.service.ISysLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-08 17:58
 */
@Component
@Aspect
public class LogAop {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ISysLogService sysLogService;

    /**开始时间**/
    private Date visitTime;

    /**访问的类**/
    private Class clazz;

    /**访问的方法**/
    private Method method;

    /**
     * 前置通知
     * 主要是获取开始时间，执行的类是哪一个，执行的是哪一个方法
     * @param joinPoint
     */
    @Before("execution(* com.zhouzhu.cotroller.*.*(..))")
    public void doBefore(JoinPoint joinPoint) throws NoSuchMethodException {
        //获取开始时间
        visitTime=new Date();
        //具体要访问的类
        clazz=joinPoint.getTarget().getClass();
        //获取访问的方法的名称
        String methodName = joinPoint.getSignature().getName();
        //获取访问的方法的参数
        Object[] args = joinPoint.getArgs();
        //获取具体执行的方法的method对象
        if (args==null || args.length==0){
            //只能获取无参数的方法
            method=clazz.getMethod(methodName);
        }else {
            Class[] classArgs=new Class[args.length];
            for (int i=0;i<args.length;i++){
                classArgs[i]=args[i].getClass();
            }
            //获取有参数的方法
            method=clazz.getMethod(methodName,classArgs);
        }

    }

    /**
     * 后置通知
     * @param joinPoint
     */
    @After("execution(* com.zhouzhu.cotroller.*.*(..))")
    public void doAfter(JoinPoint joinPoint){
        //获取访问的时长
        long time=System.currentTimeMillis()-visitTime.getTime();
        //获取url
        String url="";
        if (clazz!=null && method!=null && clazz!=LogAop.class){
            //获取类上的@RequestMapping("/XXXX")
            RequestMapping classAnnotation = (RequestMapping) clazz.getAnnotation(RequestMapping.class);
            if (classAnnotation!=null){
                String[] classValue = classAnnotation.value();
                RequestMapping methodAnnotation = method.getAnnotation(RequestMapping.class);
                if (methodAnnotation!=null){
                    String[] methodValue = methodAnnotation.value();
                    url=classValue[0]+methodValue[0];
                }
            }

            //获取访问的id地址
            String ip = request.getLocalAddr();

            //获取当前操作的用户
            //从上下文获取当前登陆的用户
            SecurityContext context = SecurityContextHolder.getContext();
            User user = (User) context.getAuthentication().getPrincipal();
            String username = user.getUsername();

            SysLog sysLog=new SysLog();
            sysLog.setExecutionTime(time);
            sysLog.setIp(ip);
            sysLog.setMethod("[类名]："+clazz.getName()+"[方法名]："+method.getName());
            sysLog.setUrl(url);
            sysLog.setUsername(username);
            sysLog.setVisitTime(visitTime);

            sysLogService.save(sysLog);
        }
    }
}
