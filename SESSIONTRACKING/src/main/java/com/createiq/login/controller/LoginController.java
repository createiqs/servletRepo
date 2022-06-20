package com.createiq.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		if (userName.equals("admin") && password.equals("12345")) {
			session.setAttribute( "admin",userName);
			request.getRequestDispatcher("welcome.html").forward(request, response);
			System.out.println(userName);
		} else {
			writer.println("<h1 style ='color:red'>Sorry Username and password incorrect!</h1>");
			request.getRequestDispatcher("index.html").include(request, response);
		}

	}

}
