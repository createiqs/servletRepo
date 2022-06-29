<%@page import="com.createiq.sms.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>All Employees</h1>
	<%
		List<Student> students = (List<Student>) request.getAttribute("students");
	/* 	String msg = (String) request.getAttribute("msg");
 		msg = msg == null ? "" : msg;*/
	%>

	
	<table border="1px">
		<tr>
			<th>Eid</th>
			<th>Ename</th>
			<th>Esal</th>
			<th>Delete Here</th>
			<th>Update Here</th>
		</tr>
		<%
			for (Student student : students) {
		%>
		<tr>
			<td><%=student.getId()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getEmail()%></td>
			<td><%=student.getEmail()%></td>
		</tr>

		<%
			}
		%>

	</table>
</body>
</html>
