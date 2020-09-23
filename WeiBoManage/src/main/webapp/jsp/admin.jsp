<%--
  Created by IntelliJ IDEA.
  User: 沈建磊
  Date: 2020/9/23
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
<p>
    <span style="margin-left: 60px;"><%--${user.username}--%>test&nbsp;你好！欢迎访问微博信息管理系统</span><a style="margin-left: 1000px;" href="">注销</a>
</p>
<p align="center">
    <a href="/toblog">微博管理</a><br/>
    <a href="/sjl/toAdmin">账户管理</a>
</p>
<table border="1px">
    <tr>
        <td>用户名</td>
        <td>昵称</td>
        <td>手机</td>
        <td>地址</td>
        <td>操作</td>
    </tr>
    <c:forEach var="list" items="${pageInfo.list}">
    <tr>
        <td>${list.username}</td>
        <td>${list.nickname}</td>
        <td>${list.mobile}</td>
        <td>${list.address}</td>
        <td><a href="/sjl/del?id=${list.id}">删除</a></td>
    </tr>
    </c:forEach>
</table>

<div>
    <a href="/sjl/toAdmin?pageNum=${pageInfo.firstPage}">首页</a>
    <c:if test="${pageInfo.hasPreviousPage}">
        <a href="/sjl/toAdmin?pageNum=${pageInfo.prePage}">上一页</a>
    </c:if>
    <c:forEach items="${pageInfo.navigatepageNums}" var="i">
        <a href="/sjl/toAdmin?pageNum=${i}">${i}</a>
    </c:forEach>
    <c:if test="${pageInfo.hasNextPage}">
        <a href="/sjl/toAdmin?pageNum=${pageInfo.nextPage}">下一页</a>
    </c:if>
    <a href="/sjl/toAdmin?pageNum=${pageInfo.lastPage}">尾页</a>
</div>
<button onclick="add()">添加数据</button>
<script type="text/javascript">
    // function del(id) {
    //     var flag=confirm("确定要删除吗");
    //     if(flag){
    //         location.href="/sjl/del?id="+id;
    //     }
    // }
    function add() {
        location.href="/jjs/toadd";
    }
</script>
</body>
</html>
