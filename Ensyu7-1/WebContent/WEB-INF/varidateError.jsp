<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Student"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>チェックエラー</title>
</head>
<body>
<form action="/Ensyu7-1/FowardFormAccount" method="post">
<input type="hidden" name="answer" value="yes">
<%
Student student = (Student)request.getAttribute("studentInfo");
ArrayList<String> errMsgs = student.getErrorMessage();
%>
未入力の項目があります。<br>
<br>
<%for(int i=0;i < errMsgs.size();i++){ %>
<%= errMsgs.get(i) %>
<%}%>
<br>
再度入力をしてください。<br>
<input type="submit" value="学生情報入力へ戻る">
</form>
</body>
</html>