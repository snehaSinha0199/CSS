<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/myTest.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	
<meta charset="ISO-8859-1">
<title>Questionaire covid</title>
</head>
<header>
		<jsp:include page="header.jsp" />
	</header>
<body>
<div class="heading">
<h2 class="survey">Covid Screening Test</h2><hr><br>
<h3>Help you get to the root of the problem</h3>
<form action="test.do" method="post">
<div class="form">
<p>Are you having fever more than 3 days ?</p>
<br>
<p>
<label><input name="q1">
<button type="button" class="btn btn-outline-success">Yes</button>
<button type="button" class="btn btn-outline-danger">No</button>
</label></p><br><br>
<p>Tell me if your fever is responding to the modifications ?</p>
<br>
<p>
<label><input name="q2">
<button type="button" name="yes2" class="btn btn-outline-success">Yes</button>
<button type="button" name="no2" class="btn btn-outline-danger">No</button>
</label></p><br><br>
<p>Is there anyone tested covid positive in your home ?</p>
<br>
<p>
<label><input name="q3">
<button type="button" name="yes3" class="btn btn-outline-success">Yes</button>
<button type="button" name="no3" class="btn btn-outline-danger">No</button>
</label></p><br><br>
<p>Is there anyone at your home facing similar symptoms ?</p>
<br>
<p>
<label><input name="q4">
<button type="button" name="yes4" class="btn btn-outline-success">Yes</button>
<button type="button" name="no4" class="btn btn-outline-danger">No</button>
</label></p><br><br>
<p>Are you facing breathlessness ?</p>
<br>
<p>
<label><input name="q5">
<button type="button" name="yes5" class="btn btn-outline-success">Yes</button>
<button type="button" name="no5" class="btn btn-outline-danger">No</button>
</label></p>
<button type="submit">Register</button>
</div>
</form>
</div>
</body>
</html>