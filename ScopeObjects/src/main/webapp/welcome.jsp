<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int id = (int) session.getAttribute("eid"); //typecasting is not necessary when displaying. Here it is for practice purposes only
	String name = (String) session.getAttribute("ename");
	float salary = (float) session.getAttribute("esalary");
	out.println("<br/><span style='color: blue; font-weight: bold;'>Id is: " + id + "</span>");
	out.println("<br/><span style='color: green;'>Name is: " + name + "</span>");
	out.println("<br/><span style='color: red; font-size: 18px;'>Salary is: " + salary + "</span>");
	%>
</body>
</html>