package com.createiq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Hi implements Servlet {

	@Override
	public void destroy() {
		System.out.println("servlet is destroyed");

	}

	@Override
	public ServletConfig getServletConfig() {

		return null;
	}

	@Override
	public String getServletInfo() {

		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		System.out.println(" init method invoking ");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Servlet Interface World!....</h1>");
		writer.println("<p> Servlet is a technology used to create dynamic web applications</p>");
		writer.println("<p> Creating a Servle class with servlet interface</p>");
		writer.println("<p>updated Servlet class in Hi servlet</p>");
		writer.close();
	}

}
