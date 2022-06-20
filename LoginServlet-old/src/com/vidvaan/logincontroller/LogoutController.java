package com.vidvaan.logincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
//		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession(false);
		session.invalidate();
//		System.out.println(session.getId());
//		writer.print(session.getId());
//		System.out.println("Is the session is New: " + session.isNew());
//		System.out.println("Session Default period of time in seconds: " + session.getMaxInactiveInterval());
//		String name = (String) session.getAttribute("name");
//		writer.print("<h3 style='color:blue'> your successfully loggedout ReLogin here!!!!..");
//		writer.print("<a href='login.html'>login</a>");
//		writer.close();

	}
	
 
}
