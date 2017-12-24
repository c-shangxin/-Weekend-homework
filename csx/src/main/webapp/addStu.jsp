<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: csx
  Date: 2017/12/22
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>学生添加</h2>
<s:form method="POST" action="stuAction_addStu">
    学生姓名：<s:textfield name="stu.sname"/><br>
    学生年龄：<s:textfield name="stu.sage" /><br>
    学生性别：<s:radio list="{'男','女'}" value="%{'男'}" name="stu.ssex"/><br>
    <s:submit value="添加"/>
</s:form>
</body>
</html>
