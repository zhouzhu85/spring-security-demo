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
</head>
<body>
    <h3>登录</h3>
    <form action="${pageContext.request.contextPath}/securityLogin" method="post">
        用户名：<input type="text" name="username"/><br/>
        密码： <input type="password" name="password"/><br/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
