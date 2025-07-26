package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Login;
import com.service.LoginService;

/**
 * Servlet implementation class SignInController
 */
@WebServlet("/SignInController")
public class SignInController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SignInController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();

		// receiving the value from the form
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");

		// convert these information into object
		Login ll = new Login();
		ll.setEmailid(emailid);
		ll.setPassword(password);

		// creating a service class object and passing the login object
		LoginService ls = new LoginService();
		String result = ls.signIn(ll);
		RequestDispatcher rd1 = request.getRequestDispatcher("success.jsp");
		RequestDispatcher rd2 = request.getRequestDispatcher("failure.jsp");
		if (result.equals("successfully login")) {
			rd1.forward(request, response);
		} else {
			rd2.forward(request, response);
		}
		response.setContentType("text/html");
	}

}
