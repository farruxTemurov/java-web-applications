<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<form action="check.jsp" method="post">
		<label>EmailId</label> <input type="email" name="emailid" /><br /> <label>Password</label>
		<input type="password" name="password" /><br /> <input type="submit"
			value="SignIn!"> <input type="reset" value="reset">
	</form>
</body>
</html>