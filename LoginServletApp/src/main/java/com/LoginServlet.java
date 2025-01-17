package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();// it helps to display the output on browser
		// request.getParameter("fieldName") which helps to receive the value as string
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		if (emailid.equals("test@gmail.com") && password.equals("test@")) {
			pw.println("Successful login! with GET Method");
		} else {
			pw.println("Failure try once again! with GET Method");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();// it help to display the output on browser
		// request.getParameter("fieldName") which help to receive the value as string
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		if (emailid.equals("test@gmail.com") && password.equals("test@")) {
			pw.println("Successful login! with POST Method");
		} else {
			pw.println("Failure try once again! with POST Method");
		}
	}

}