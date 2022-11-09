package com.ciq.sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.sms.model.Student;
import com.ciq.sms.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentSaveController
 */
public class StudentSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	private StudentServiceImpl service = new StudentServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		double fee = Double.parseDouble(request.getParameter("fee"));
		String email = request.getParameter("email");
		Student student = new Student(id, name, fee, email);
		service.save(student);
		request.getRequestDispatcher("sms-list.jsp").forward(request, response);

	}

}
