package com.vidvaan.logincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String user = request.getParameter("user");
		writer.print(user + " your login successfully");
		HttpSession session = request.getSession();
		session.setAttribute("name", user);
		writer.print(session.getId());
		ServletContext context = getServletContext();
		int totalUsers = (int) context.getAttribute("totalUsers");
		int currentUsers = (int) context.getAttribute("currentUsers");
		writer.println("<br> totalusers: " + totalUsers);
		writer.println("<br> currentusers: " + currentUsers);
		writer.print("<a href='./logout'>logout</a>");
		writer.close();
	}

}
