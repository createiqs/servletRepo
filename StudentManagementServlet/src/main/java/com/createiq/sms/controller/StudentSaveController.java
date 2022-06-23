package com.createiq.sms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.sms.model.Student;
import com.createiq.sms.service.StudentServiceImpl;

public class StudentSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentServiceImpl serviceImpl = new StudentServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String courseName = request.getParameter("courseName");
		Student student = new Student(name, email, courseName);
		serviceImpl.save(student);
		request.getRequestDispatcher("findAll").forward(request, response);
		writer.close();

	}

}
