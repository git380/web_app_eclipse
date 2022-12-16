<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.SiteEV" %>
<%
SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>湊くんのページ</title>
</head>
<body>
<h1>湊くんのページへようこそ</h1>
<p>
<button onclick="location.href='/9-3/MinatoIndex?action=like'">👍</button>：
<%= siteEV.getLike() %>人
<button onclick="location.href='/9-3/MinatoIndex?action=dislike'">👎</button>：
<%= siteEV.getDislike() %>人
</p>
<h2>湊くんは！？ </h2>
<p><%= siteEV.getAns() %></p>
</body>
</html>