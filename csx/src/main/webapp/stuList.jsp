<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: csx
  Date: 2017/12/22
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="500" border="1">
    <tr>
        <td>编号</td><td>姓名</td>
        <td>年龄</td><td>性别</td><td>管理</td>
    </tr>
    <s:iterator value="#request.stuList" var="s" status="ids">
        <tr>
            <td>${ids.count}</td><td>${s.sname}</td>
            <td>${s.sage}</td><td>${s.ssex}</td>
            <td><a href="">修改</a></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
