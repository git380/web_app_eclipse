<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生用メニュー</title>
</head>
<body>
<form action="/Ensyu7-1/FowardLogoutMessage" method="post">
<%
Student student = (Student)request.getAttribute("student");
%>
<%= student.getId() %>さんでログインしています<br>
<a href="http://localhost:8080/Ensyu7-1/FowardClassesServlet">授業一覧</a><br>
<input type="submit" value="ログアウト">
</form>
</body>
</html>