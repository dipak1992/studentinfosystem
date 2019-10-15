<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up form</title>
</head>
<body>

	<div>
		<form action="StudentController" method="post">
			<div>
				<label>Username</label> <input type="text" name="uname">
			</div>
			<div>
				<label>Password</label> <input type="password" name="pass">
			</div>
			<div>
				<label>Email</label> <input type="email" name="email">
			</div>
			<div>
				<label>DOB</label> <input type="date" name="dob">
			</div>
			<div>
				<input type="submit" value="SignUp">
			</div>

		</form>
	</div>

</body>
</html>