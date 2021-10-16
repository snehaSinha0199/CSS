<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/stylelogin.css">
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<header>
		<jsp:include page="header.jsp" />
	</header>
<div class="loginbox">
<h1>Login</h1>
<c:if test="${requestScope.success eq 'fail'}">
<h3 id="invalid">${requestScope.msg}</h3>
</c:if>
<c:if test="${requestScope.isSuccess}">
<h3 id="valid">${requestScope.message}</h3>
</c:if>
<form action="login.do" method="post">
<p>Username</p>
<input type="text" name="email" placeholder="Enter email">
<p>Password</p>
<input type="password" name="pwd" placeholder="Enter Password" >
<a href="mytest.jsp"><input type="submit" name="" value="Login" ></a>
<a href="forgot.jsp">Lost your Password?</a><br>
<a href="registration.jsp">Don't have an account</a>
</form>
</div>

</body>
</html>