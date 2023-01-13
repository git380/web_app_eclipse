<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/sore"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断</title>
</head>
<body>
<c:out value ="Hello"/>
<c:forEach var="i" begin="0" end="9" sep="1">
	<c:out value ="${i}"/>
</c:forEach>

<h1>スッキリ健康診断の結果</h1>
<form action="/example/HealthCheck" method="post">
身長：<input type="text" name="height">(cm)<br>>
体重：<input type="text" name="weight">(kg)<br>
</form>
<p>
身長：${health.height}<br>
体重：${health.weight}<br>
BMI：${health.bmi}<br>
体格：${health.bodytype}
</p>
<a href="HealthCheck">戻る</a>
</body>
</html>