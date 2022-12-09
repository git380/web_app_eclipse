<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生情報登録</title>
</head>
<body>
<form action="/Ensyu5-1/FormStudentServlet" method="post">
学籍番号：<input type="text" name="studentnumber"><br>
名前：<input type="text" name="studentname"><br>
クラス<br>
R3A1<input type="radio" name="studentclass" value="R3A1"><br>
S2A1<input type="radio" name="studentclass" value="S2A1"><br>
<input type="submit" value="登録">
</form>
</body>
</html>