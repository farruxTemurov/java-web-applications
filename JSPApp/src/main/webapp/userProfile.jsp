<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Profile</title>
</head>
<body>
	<h1>Welcome to Your Profile</h1>
	<%@ page import="com.bean.User"%>
	<!-- Use the jsp:useBean tag to instantiate the User bean -->
	<jsp:useBean id="user" class="com.bean.User" scope="request" />

	<!-- Use the jsp:setProperty tag to set the properties of the User bean from the form data -->
	<jsp:setProperty name="user" property="username" param="username" />
	<jsp:setProperty name="user" property="password" param="password" />

	<!-- Use the jsp:getProperty tag to display the properties of the User bean -->
	<h2>
		Username:
		<jsp:getProperty name="user" property="username" /></h2>
	<h2>
		Password:
		<jsp:getProperty name="user" property="password" /></h2>

	<a href="useForm.jsp">Go back to the form</a>
</body>
</html>
