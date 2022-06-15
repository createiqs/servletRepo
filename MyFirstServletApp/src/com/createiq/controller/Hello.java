package com.createiq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class Hello extends HttpServlet {
	// doget, dopost, doput, delete
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Http Servlet World!....</h1>");
		writer.println("<p> Servlet is a technology used to create dynamic web applications</p>");
		writer.close();
	}

}
