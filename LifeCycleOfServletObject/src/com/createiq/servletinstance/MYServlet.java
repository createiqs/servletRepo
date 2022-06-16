package com.createiq.servletinstance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MYServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("servlet is destroyed!.........");

	}

	@Override
	public ServletConfig getServletConfig() {

		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		config.getServletContext();
		System.out.println("init method is invoking..........");

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		PrintWriter writer = res.getWriter();
		writer.print("<h1>Servlet service method is invoking!....</h1>");
		writer.close();

	}

}
