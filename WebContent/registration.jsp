<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/stylereg.css">
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<header>
		<jsp:include page="header.jsp" />
	</header>
	<form action="register.do" method="post">
		<div class="regform">
			<h1>Registration Form</h1>
		</div>
		<div class="main">

			<div id="name">
				<h2 class="name">Name</h2>
				<input class="firstname" type="text" name="firstname"
					placeholder="Enter First Name" required><br> <label
					class="firstlabel">First Name</label> <input class="lastname"
					type="text" name="lastname" placeholder="Enter Last Name">
				<label class="lastlabel">Last Name</label>
			</div>

			<h2 class="name">Email</h2>
			<input class="email" type="email" name="email"
				placeholder="Enter email" required>

			<h2 class="name">Phone</h2>
			<input class="number" type="text" name="phone" required><label
				class="phone-number">Phone Number</label>

			<h2 class="name">DOB</h2>
			<input class="dob" type="text" name="dob"
				placeholder="Enter date of birth" required>

			<h2 id="gender">Gender</h2>
			<input class="radio-one" type="radio"
				name="gender" value="Male"><span class="checkmark">Male</span>
<input class="radio-two" type="radio"
				name="gender" value="Female"><span class="checkmark">Female</span>

			<h2 class="name">Select State</h2>
			<select class="option" name="state">
				<option disabled="disabled" selected="selected" required>Choose
					Option</option>
				<option>Madhya pradesh</option>
				<option>Maharastra</option>
				<option>Delhi</option>
				<option>Bihar</option>
				<option>Uttar Pradesh</option>
			</select>

			<h2 class="name">Create password</h2>
			<input class="pwd" type="password" name="pwd"
				placeholder="Enter Password" required>
			<h2 class="name">Confirm password</h2>
			<input class="pwd" type="password" name="password"
				placeholder="Enter Password" required>



			<button type="submit">Register</button>


		</div>
	</form>
</body>
</html>