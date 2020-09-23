<%--
  Created by IntelliJ IDEA.
  User: 沈建磊
  Date: 2020/9/23
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <span style="margin-left: 60px;"><%--${user.username}--%>test&nbsp;你好！欢迎访问微博信息管理系统</span><a style="margin-left: 1000px;" href="">注销</a>
</p>
        <h1>个人账户</h1>
<form action="toadmim" method="post">
    用户名:<input type="text" name="username" value="${user.username}"><br>
    密码:<input type="text" name="password" value="${user.password}"><br>
    <input type="submit" value="编辑数据">
</form>
</table>
</body>
</html>
