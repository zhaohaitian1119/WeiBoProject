<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/static/js/jquery-1.12.4.js"></script>
<body>
<p>
    <span style="margin-left: 60px;"><%--${user.username}--%>test&nbsp;你好！欢迎访问微博信息管理系统</span><a style="margin-left: 1000px;" href="">注销</a>
</p>
    <center>
        <form action="/addBlogcx" method="post">
            <p>微博内容:<textarea name="content" rows="5px" cols="50px"></textarea></p>
            <p><input type="submit" value="保存数据" />&nbsp;&nbsp;&nbsp;<input type="button" onclick="javascript:history.back(-1);" value="返回" /></p>
        </form>
    </center>

</body>
</html>
