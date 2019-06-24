<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/17
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<html>
<head>
    <title>首页</title>
</head>
<body>
欢迎 ${username}
<security:authorize access="hasRole('ROLE_USER')">
    <a href="${pageContext.request.contextPath}/product/add">商品添加</a>
</security:authorize>

<security:authorize access="hasRole('ROLE_ADMIN')">
    <a href="${pageContext.request.contextPath}/product/update">商品修改</a>
</security:authorize>

<security:authorize access="hasRole('ROLE_ADMIN')">
    <a href="${pageContext.request.contextPath}/product/list">商品查询</a>
</security:authorize>

<security:authorize access="hasRole('ROLE_ADMIN')">
    <a href="${pageContext.request.contextPath}/product/delete">商品删除</a>
</security:authorize>
</body>
</html>
