<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
</head>
<body>
    <h3>登录</h3>
    <c:if test="${not empty param.error}">
        <p style="color: red">用户名或密码错误</p>
    </c:if>
    <form id="loginForm">
        用户名：<input type="text" name="username"/><br/>
        密码： <input type="password" name="password"/><br/>
        验证码：<input type="text" name="imageCode"/><img src="${pageContext.request.contextPath}/imageCode"/><br/>
        记住我：<input type="checkbox" name="remember-me" value="true"><br/>
        <input type="button" value="登录" id="loginBtn"/>
    </form>
</body>
<script>
    $(function () {
        $("#loginBtn").click(function () {
            $.post("${pageContext.request.contextPath}/securityLogin",$("#loginForm").serialize(),function (data) {
                console.log(data)
                if (data.success){
                    window.location.href="${pageContext.request.contextPath}/product/index";
                }else{
                    alert("登录失败："+data.errorMsg);
                }
            },"json");
        })
    })
</script>
</html>
