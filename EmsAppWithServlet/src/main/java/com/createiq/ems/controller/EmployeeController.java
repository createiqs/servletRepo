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

		PrintWriter out = response.getWriter();
		String id = request.getParameter("eid");
		String name = request.getParameter("ename");
		String salary = request.getParameter("esalary");
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>employee registered successfully</h3>");
		out.print("<p>" + id + "</br>" + name + "</br>" + salary + "</p>");
		out.println("</body>");
		out.println("<a href='index.html'>home</a>");
		out.println("</html>");
		out.close();

	}

}
