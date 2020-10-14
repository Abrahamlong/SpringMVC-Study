<%--
  Created by IntelliJ IDEA.
  User: A80024
  Date: 2020/10/14
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
    <h2>登录成功页面</h2>
    <hr/>
    ${username}
    <hr>
    <a href="${pageContext.request.contextPath}/user/logout">注销登录</a>
    <hr/>
    <a href="${pageContext.request.contextPath}/user/index">回到首页</a>
</body>
</html>
