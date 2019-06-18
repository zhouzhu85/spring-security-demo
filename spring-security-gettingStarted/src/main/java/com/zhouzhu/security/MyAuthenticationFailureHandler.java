package com.zhouzhu.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-18 14:51
 */
public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {

    /**
     * ObjectMapper: jackson 框架的工具类，用于转换对象为 json 字符串
     */
    private ObjectMapper objectMapper=new ObjectMapper();

    /**
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param e
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        Map map=new HashMap();
        map.put("failure",false);
        String json = objectMapper.writeValueAsString(map);
        httpServletResponse.setContentType("text/json;charset=utf-8");
        httpServletResponse.getWriter().write(json);
    }
}
