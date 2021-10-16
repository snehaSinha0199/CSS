<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container main-container">
	<c:if test="${sessionScope.status eq 'suspect'}">
		<h2 class="report-title pass">You are suspected to be a covid patient &#128578;</h2>
		<hr>
	</c:if>

		<c:if test="${sessionScope.status eq 'notsuspect'}">
		<h2 class="report-title fail">Congratulation.You are safe. &#x1F615;</h2>
		<hr>
		</c:if>
		
		
		
		
	</div>
</body>
</html>