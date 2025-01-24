<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to JSP</h2>
	<%!int a, b, sum, x, y;%>
	<%
	System.out.println("Welcome to JSP on console");
	out.println("Welcome on browser");
	out.println("Refresh on browser");
	%>
	<%
	//int a = 10;
	//int b = 12;

	//int sum = a + b;
	a = 100;
	b = 201;
	sum = a + b;
	out.println("the sum of a and b is " + sum);
	%>
	<p>
		<font color='green'>Sum of <u>100</u> and <u>300</u> is <%=100 + 300%></font>
	</p>
	<p>
		<font color="blue">Sum of <%=a%> and <%=b%> is <%=sum%></font>
	</p>
</body>
</html>