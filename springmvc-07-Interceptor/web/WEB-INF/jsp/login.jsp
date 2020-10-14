<%--
  Created by IntelliJ IDEA.
  User: A80024
  Date: 2020/10/14
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/login">
        用户名：<input type="text" name="username"> <br>
        密码： <input type="password" name="pwd"> <br>
        <input type="submit" value="提交">
    </form>
    <hr/>
    <a href="${pageContext.request.contextPath}/user/index">回到首页</a>
</body>
</html>
