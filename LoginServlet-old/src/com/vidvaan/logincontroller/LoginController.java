package com.vidvaan.logincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("init method call " + this.getClass().getName());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String user = request.getParameter("user");
		String password = request.getParameter("pwd");
		String submitType = request.getParameter("submitType");
		if (password.equals("admin") && submitType.equals("login")) {
			request.getRequestDispatcher("welcome").forward(request, response);

		} else {
			writer.println("<h3 style='color:red'>Sorry username or password incorrect!!!</h3>");
			request.getRequestDispatcher("login.html").include(request, response);

		}
		writer.close();

	}

}
