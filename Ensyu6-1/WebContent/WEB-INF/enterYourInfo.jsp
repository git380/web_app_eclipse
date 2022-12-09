<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生情報入力</title>
</head>
<body>
<form action="/Ensyu6-1/FowardSelectPaymentServlet" method="post">
学籍番号：<input type="text" name="student-number"><br>
クラス：
　<input type="radio" name="student-class" value="S2A1">S2A1<br>
　　　　　　<input type="radio" name="student-class" value="R3A1">R3A1<br>
名前：　　　<input type="text" name="student-name"><br>
<input type="submit" value="送信">
</form>
</body>
</html>