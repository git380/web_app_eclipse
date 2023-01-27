<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断</title>
</head>
<body>

<c:out value ="Hello"/>
<c:forEach var="i" begin="0" end="9" step="1">
	<c:out value ="${i}"/>
</c:forEach>

<h1>スッキリ健康診断の結果</h1>
<p>
身長：${health.height}<br>
体重：${health.weight}<br>
BMI：${Health.bmi}<br>
体格：${Health.bodytype}
</p>
<a href="HealthCheck">戻る</a>

</body>
</html>