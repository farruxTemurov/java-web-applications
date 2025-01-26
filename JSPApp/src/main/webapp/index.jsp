<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index JSP</title>
</head>
<body>
	<h2>Welcome! Please enter your name</h2>
	<form action="greet.jsp" method="POST">
		<label for="name">Your name</label>
		<input type="text" id="name" name="name" required>
		<button type="submit">Submit</button>
	</form>
</body>
</html>