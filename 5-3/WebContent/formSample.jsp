<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録もどき</title>
</head>
<body>
<form action="/5-3/FormSampleServlet" method="post">
クラス名：<br>
<input type="text" name="student-class"><br>
名前：<br>
<input type="text" name="student-name"><br>
出席番号：<br>
<input type="text" name="student-number"><br>
性別：<br>
男<input type="radio" name="student-gender" value="0">
女<input type="radio" name="student-gender" value="1"><br>
<%int ransu=(int)(Math.random()*10);
for (int i=0;i<=ransu;i++){
	int j=i+1;
	%><%=j %>科目名：<input type="text" name="score-<%=i %>"><br><%
}%>
<input type="submit" value="登録">
</form>
</body>
</html>