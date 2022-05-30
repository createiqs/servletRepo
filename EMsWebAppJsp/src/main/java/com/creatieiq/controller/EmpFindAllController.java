package com.creatieiq.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.creatieiq.dao.EmployeeDaoImpl;
import com.creatieiq.model.Employee;

public class EmpFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static EmployeeDaoImpl daoImpl = new EmployeeDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter out = response.getWriter();

		List<Employee> employees = daoImpl.findAll();
		request.setAttribute("empAll", employees);
		request.getRequestDispatcher("findall.jsp").forward(request, response);

	}

}
