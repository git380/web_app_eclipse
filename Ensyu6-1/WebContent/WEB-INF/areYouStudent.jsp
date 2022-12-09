<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生確認</title>
</head>
<body>
<form action="/Ensyu6-1/FowardEnterYourInfoServlet" method="post">
あなたは広島情報専門学校の学生ですか？<br>
<input type="radio" name="answer" value="yes">はい<br>
<input type="radio" name="answer" value="no">いいえ<br>
<input type="submit" value="送信">
</form>
</body>
</html>