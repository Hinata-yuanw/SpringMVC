<%--
  Created by IntelliJ IDEA.
  User: yuan.wang
  Date: 2022/8/31
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--在web-inf下的所有页面或者资源只能通过controller或者servlet进行访问--%>

<h1>登录页面</h1>

<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="username"/>
    密码：<input type="password" name="password"/>
    <input type="submit" value="提交">
</form>

</body>
</html>
