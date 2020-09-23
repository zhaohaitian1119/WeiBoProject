<%--
  Created by IntelliJ IDEA.
  User: 吉俊烁
  Date: 2020/9/23
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<body>
<p>
    <span style="margin-left: 60px;"><%--${user.username}--%>test&nbsp;你好！欢迎访问微博信息管理系统</span><a style="margin-left: 1000px;" href="">注销</a>
</p>
<p align="center">
    <a href="/toblog">微博管理</a><br/>
    <a href="/sjl/toAdmin">账户管理</a>
</p>
<p align="center" id="error" style="color: red;">${error}</p>
<form action="/jjs/doadd" method="post" enctype="multipart/form-data">
    <table border="1px" align="center">
        <tr>
            <td align="center" style="font-size: 30px" colspan="2">添加账号</td>
        </tr>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="username"/><span style="color: red;">*</span></td>
        </tr>
        <tr>
            <td>密 码:</td>
            <td><input type="password" name="password"/><span style="color: red;">*</span></td>
        </tr>
        <tr>
            <td>昵 称:</td>
            <td><input type="text" name="nickname"/><span style="color: red;">*</span></td>
        </tr>
        <tr>
            <td>年 龄:</td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td>性 别:</td>
            <td>
                <select name="sex">
                    <option value="">请选择</option>
                    <option value="1">男</option>
                    <option value="0">女</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>手 机:</td>
            <td><input type="text" name="mobile"/><span style="color: red;">*</span></td>
        </tr>
        <tr>
            <td>地 址:</td>
            <td><input type="text" name="address"/></td>
        </tr>
        <tr>
            <td>头 像:</td>
            <td><input type="file" name="picpathFile"/></td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <input type="submit" value="保存数据"/>
                <input type="reset" value="返回"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
<script type="text/javascript">
    $("form").submit(function () {
        var username = $("[name='username']").val();
        if (username == "") {
            $("#error").text("用户名不能为空!");
            return false;
        }
        var password = $("[name='password']").val();
        if (password == "") {
            $("#error").text("密码不能为空!");
            return false;
        }
        var nickname = $("[name='nickname']").val();
        if (nickname == "") {
            $("#error").text("昵称不能为空!");
            return false;
        }
        var mobile = $("[name='mobile']").val();
        if (mobile == "") {
            $("#error").text("手机不能为空!");
            return false;
        }
    })

</script>
