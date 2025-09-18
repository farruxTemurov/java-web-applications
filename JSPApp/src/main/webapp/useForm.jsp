<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Use Form</title>
</head>
<body>
	<h2>Login Form</h2>
	<form action="userProfile.jsp" method="POST">
		<label for="username">Your name</label> <input type="text" id="name"
			name="username" required> <label for="password">Your
			password</label> <input type="password" id="password" name="password"
			required>
		<button type="submit">Submit</button>
	</form>
</body>
</html>
