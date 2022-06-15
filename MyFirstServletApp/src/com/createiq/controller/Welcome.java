package com.createiq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Welcome extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Generic World!....</h1>");
		writer.println("<p> Servlet is a technology used to create dynamic web applications</p>");
		writer.println("<p> Creating a Servle class with servlet<style color='green'> Generic Servlet</style></p>");
		writer.println("<p>updated Servlet class in Hi servlet</p>");
		writer.close();
		
	}

}
