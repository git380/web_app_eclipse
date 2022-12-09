<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>授業一覧</title>
</head>
<body>
<form action="/Ensyu7-1/FowardLogoutMessage" method="post">
<%
Student student = (Student)session.getAttribute("student");
%>
<%= student.getId() %>さんでログインしています<br>
授業の一覧<br>
JavaScript<br>
Webアプリケーション構築
</form>
</body>
</html>