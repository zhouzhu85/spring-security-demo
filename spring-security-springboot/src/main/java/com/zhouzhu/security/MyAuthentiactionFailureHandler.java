package com.zhouzhu.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouzhu
 * @Description 登录失败处理器
 * @create 2019-06-20 13:53
 */
@Component
public class MyAuthentiactionFailureHandler implements AuthenticationFailureHandler{
    private ObjectMapper objectMapper=new ObjectMapper();
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        //返回json数据
        Map map=new HashMap();
        map.put("success",false);
        //错误信息
        map.put("errorMsg",e.getMessage());
        String json = objectMapper.writeValueAsString(map);
        httpServletResponse.setContentType("text/json;charset=utf-8");
        httpServletResponse.getWriter().write(json);
    }
}
