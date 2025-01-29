package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddEmployeeController")
public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddEmployeeController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		// receive the value from form and convert it to specific data types.
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		float salary = Float.parseFloat(request.getParameter("salary"));
		LocalDate doj = LocalDate.parse(request.getParameter("doj"));

		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setDoj(doj);

		RequestDispatcher rd = request.getRequestDispatcher("addEmployee.jsp");
		EmployeeService es = new EmployeeService();

		String result = es.storeEmployee(emp);
		pw.print(result);

		rd.include(request, response);
		response.setContentType("text/html");
	}

}
