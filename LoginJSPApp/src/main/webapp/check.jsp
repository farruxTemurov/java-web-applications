<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!String emailid, password;%>
	<%
	emailid = request.getParameter("emailid");
	password = request.getParameter("password");
	if (emailid.equals("test1@gmail.com") && password.equals("test1@")) {
		out.println("successful login");
	} else {
		out.println("failed, try once again");
	}
	%>
</body>
</html>