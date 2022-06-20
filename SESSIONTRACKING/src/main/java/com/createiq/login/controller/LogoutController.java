package com.createiq.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutController
 */
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession(false);
		session.setMaxInactiveInterval(5);
		session.removeAttribute("admin");
		writer.println("<h1 style ='color:blue'>logged out successfully!</h1>");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		writer.close();
	}

}
