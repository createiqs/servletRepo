package com.createiq.sms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.sms.model.Student;
import com.createiq.sms.service.StudentService;
import com.createiq.sms.service.StudentServiceImpl;

public class StudentFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static StudentService service = new StudentServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		List<Student> allStudents = service.getAllStudents();
		response.setContentType("text/html");
		writer.println("<table border='1px'>");
		writer.print("<tr><th>EID</th><th>ENAME</th><th>ESAL</th><th>EMAIL</th></tr>");
		for (Student student : allStudents) {
			writer.print("<tr>");
			writer.print("<td>" + student.getId() + "</td>");
			writer.print("<td>" + student.getName() + "</td>");
			writer.print("<td>" + student.getEmail() + "</td>");
			writer.print("<td>" + student.getCourseName() + "</td>");
			writer.print("</tr>");
		}
		writer.println("</table>");
		writer.print("<a href='index.jsp'>home</a>");
		writer.close();
	}

}
