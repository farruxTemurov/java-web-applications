<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h2>Welcome Admin! please enter your credentials</h2>
	<form action="welcome.jsp" method="POST">
		<label for="name">Your name</label>
		<input type="text" id="name" name="name" required>
		<label for="password">Your password</label>
		<input type="password" id="password" name="password" required>
		<button type="submit">Submit</button>
	</form>
</body>
</html>