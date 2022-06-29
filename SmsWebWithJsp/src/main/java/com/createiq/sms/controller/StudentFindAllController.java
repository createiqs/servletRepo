package com.createiq.sms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.sms.model.Student;
import com.createiq.sms.service.StudentServiceImpl;

@WebServlet("/findAll")
public class StudentFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentServiceImpl service = new StudentServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		List<Student> allStudents = service.getAllStudents();
		request.setAttribute("students", allStudents);
		request.getRequestDispatcher("sms-list.jsp").forward(request, response);
//		for (Student student : allStudents) {
//			System.out.println(student);
//		}
	}

}
