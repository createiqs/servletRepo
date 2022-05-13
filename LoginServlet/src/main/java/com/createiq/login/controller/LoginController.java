package com.createiq.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		Cookie cookie=new Cookie(userName, password);
		response.addCookie(cookie);
		if(userName.equals("admin") && password.equals("abcd")) {
//			out.println("<h1>"+userName+" successfully logged in"+"</h1>");
			request.getRequestDispatcher("home.html").forward(request, response);
			
		}else {
			out.println("<h3 style='color:red'>Sorry username or password incorrect!!!</h3>");
		}
		out.close();
		

	}

}
