<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date,java.text.SimpleDateFormat" %>
<%
// 乱数
String[] luckArray = { "超スッキリ◇　[(・∀・)ｲｲﾈ!!]", "スッキリ◇　[!(^^)!]", "最悪◇　[(。´･ω･)?]" };
int index = (int) (Math.random() * 3);
String luck = luckArray[index];

// 日付取得
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日");
String today = sdf.format(date);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>今日の★スッキリ★占い</title>
</head>
<body>
<p><%= today %>の運勢は◇｢<%= luck %>｣です</p>
</body>
</html>
