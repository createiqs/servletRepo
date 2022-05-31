package com.vidvaan.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.service.EmployeeService;
import com.vidvaan.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class FindAllController
 */
public class FindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FindAllController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employees = employeeService.findAll();
		request.setAttribute("employees", employees);
		request.getRequestDispatcher("findAll.jsp").forward(request, response);
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

} 
