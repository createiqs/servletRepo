package com.createiq.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		int id = Integer.parseInt(request.getParameter("eid"));
		String name = request.getParameter("ename");
		double sal = Double.parseDouble(request.getParameter("esal"));
		request.getRequestDispatcher("welcome.html").include(request, response);
		writer.println("<h1>"+id+" "+name+"" +sal+"</h1>");
		

	}

}
