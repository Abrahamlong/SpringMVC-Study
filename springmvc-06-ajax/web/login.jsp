<%--
  Created by IntelliJ IDEA.
  User: A80024
  Date: 2020/10/14
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax登录测试</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>
    <script>

        function ajax1(){
            $.post({
                url:"${pageContext.request.contextPath}/ajax3",
                data:{"name" : $("#name").val()},
                success:function (data) {
                    if (data.toString()=='OK'){
                        $("#userInfo").css("color","green");
                    }else {
                        $("#userInfo").css("color","red");
                    }
                    $("#userInfo").html(data);
                }
            });
        }
        function ajax2(){
            $.post({
                url:"${pageContext.request.contextPath}/ajax3",
                data:{"pwd" : $("#pwd").val()},
                success:function (data) {
                    if (data.toString()=='OK'){
                        $("#pwdInfo").css("color","green");
                    }else {
                        $("#pwdInfo").css("color","red");
                    }
                    $("#pwdInfo").html(data);
                }
            });
        }

    </script>
</head>
<body>
    <p>
        用户名:<input type="text" id="name" onblur="ajax1()"/>
        <span id="userInfo"></span>
    </p>
    <p>
        密码:<input type="text" id="pwd" onblur="ajax2()"/>
        <span id="pwdInfo"></span>
    </p>
</body>
</html>
