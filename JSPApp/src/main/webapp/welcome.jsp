<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<%
	// Get the username and password from the form submission
	String username = request.getParameter("name");
	String password = request.getParameter("password");

	// Check if the credentials match (hardcoded for simplicity)
	if ("admin".equals(username) && "password123".equals(password)) {
	%>
	<h1>
		Welcome,
		<%=username%>! You have logged in successfully.
	</h1>
	<%
	} else {
	%>
	<h1>Login failed. Invalid username or password.</h1>
	<%
	}
	%>

	<a href="login.jsp">Try again</a>
</body>
</html>