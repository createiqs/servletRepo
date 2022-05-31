package com.vidvaan.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.ems.service.EmployeeService;
import com.vidvaan.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class DeleteController
 */
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int eid = Integer.parseInt(request.getParameter("eid"));
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.delete(eid);
		request.setAttribute("msg", "Record Successfully Deleted");
		request.getRequestDispatcher("FindAllController").forward(request, response);
	}

	

}
