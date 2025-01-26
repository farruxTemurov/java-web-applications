<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Greeting</title>
</head>
<body>
	<h1>Welcome, <%=request.getParameter("name") %>!</h1>
	<p>Thank you for visiting out site!</p>
	<a href="index.jsp">Go Back</a>
</body>
</html>