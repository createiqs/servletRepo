package com.createiq.sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.sms.model.Student;
import com.createiq.sms.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentUpdateController
 */
public class StudentUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static StudentServiceImpl impl = new StudentServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String course = request.getParameter("course");
		Student student = new Student(id, name, email, course);
		impl.update(student);
		request.getRequestDispatcher("findAll").forward(request, response);

	}

}
