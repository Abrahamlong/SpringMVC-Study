<%--
  Created by IntelliJ IDEA.
  User: A80024
  Date: 2020/10/13
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>
    <script>
      function a() {
        $.post({

        })
      }
    </script>
  </head>
  <body>
    <%--失去焦点的时候利用ajax异步发起一个请求（携带信息）到后台--%>
    用户名：<input type="text" id="userName" onblur="a()">
  </body>
</html>
