<%--
  Created by IntelliJ IDEA.
  User: A80024
  Date: 2020/10/14
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>测试文件上传/下载</title>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
      <input type="file" name="file"/>
      <input type="submit" value="upload">
    </form>
    <hr/>
    <a href="${pageContext.request.contextPath}/download">点击下载</a>
  </body>
</html>
