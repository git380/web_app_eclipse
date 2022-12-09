<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.IOException"%>
<%@ page import="java.io.PrintWriter"%>

<%@ page import="javax.servlet.ServletException"%>
<%@ page import="javax.servlet.annotation.WebServlet"%>
<%@ page import="javax.servlet.http.HttpServlet"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ page import="javax.servlet.http.HttpServletResponse"%>

<%
int n = (int) (Math.random()*101);// 乱数

int i;
String a="";
%>

<!DOCTYPE html>
<html>
<head>
<title>ランダムリストプログラム</title>
</head>
<body>
<div>
<p><%= n %>人分出力</p>
<%for (i = 1; i <= n; i++) {
	if (i < 10) {%>
		&nbsp&nbsp<%= i %>人目<br>
	<%}else {%>
		<%= i %>人目<br>
	<%}%>
<%}%>

</div>
</body>
</html>