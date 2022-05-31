package com.vidvaan.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.service.EmployeeService;
import com.vidvaan.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class UpdateController
 */
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int eid = Integer.parseInt(request.getParameter("eid"));
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.findById(eid);
		request.setAttribute("employee", employee);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String eno = request.getParameter("eno");
		String ename = request.getParameter("ename");
		String esal = request.getParameter("esal");

		Employee employee = new Employee();
		employee.setEid(Integer.parseInt(eno));
		employee.setEname(ename);
		employee.setEsal(Double.parseDouble(esal));

		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.update(employee);
		request.setAttribute("msg", "Record Successfully Updated");
		request.getRequestDispatcher("FindAllController").forward(request, response);
	}

}
