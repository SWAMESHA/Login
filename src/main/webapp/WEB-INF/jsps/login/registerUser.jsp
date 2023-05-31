<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>
	<h2>User Register</h2>
	<form action="registerUser" method="post">
	<pre>
		Name: <input type="text" name="name"/>
		Email: <input type="text" name="email"/>
		Password: <input type="password" name="password"/>
		Confirm password: <input type="password" name="confirmPassword"/>
		<input type="submit" value="register"/>
	</pre>
	
	</form>
	

</body>
</html>