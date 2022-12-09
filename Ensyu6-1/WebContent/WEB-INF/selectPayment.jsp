<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>支払方法選択</title>
</head>
<body>
<%
Student student = (Student)request.getAttribute("studentInfo");
%>
学籍番号：<%= student.getNumber() %><br>
クラス：<%= student.getClas() %><br>
名前：<%= student.getName() %><br>
項目を選択してください。<br>
・授業に参加<br>
・試験料の支払い
</body>
</html>