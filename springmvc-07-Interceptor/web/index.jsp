<%--
  Created by IntelliJ IDEA.
  User: A80024
  Date: 2020/10/14
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
    <a href="${pageContext.request.contextPath}/interceptor">拦截器测试</a>
    <hr/>
    <a href="${pageContext.request.contextPath}/user/enterLogin">进入登录页面</a>
    <hr/>
    <a href="${pageContext.request.contextPath}/user/success">进入main页面</a>
    <hr>
    <a href="${pageContext.request.contextPath}/user/logout">注销登录</a>
  </body>
</html>
