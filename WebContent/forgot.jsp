<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forget</title>
<link rel="stylesheet" type="text/css" href="css/styleforgot.css">
</head>
<body>
  <div class="center">
  <h2 class="forgot">Forgot Password</h2>
  <c:if test="${requestScope.success eq 'fail'}">
<h3 id="invalid">${requestScope.msg}</h3>
</c:if>
  <form action="forget.do" method="post">
  <p>Enter your email</p>
<input class="email" type="text" name="email"/><br>
     <input type="submit" name="" value="Send" ><br>
     <a href="login.jsp">Back to Login</a><br>
<a href="registration.jsp">Don't have an account</a>
  </form>
   </div>
</body>
</html>

