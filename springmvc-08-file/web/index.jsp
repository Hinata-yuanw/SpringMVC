<%--
  Created by IntelliJ IDEA.
  User: yuan.wang
  Date: 2022/8/31
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit" name="upload">
</form>

<a href="/download">点击下载</a>

</body>
</html>
