package com.createiq.sms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.createiq.sms.service.StudentServiceImpl;

public class StudentDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentServiceImpl service = new StudentServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		int eid = Integer.parseInt(request.getParameter("id"));
		writer.print("deleted..." + "<br>");
		service.delete(eid);
		writer.print("<a href='index.jsp'>home</a>");
		writer.close();

	}

}
