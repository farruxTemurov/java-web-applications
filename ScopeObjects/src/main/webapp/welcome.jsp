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
	out.println("<br/> Id is " + id);
	out.println("<br/> Name is " + name);
	out.println("<br/> Salary is " + salary);
	%>
</body>
</html>