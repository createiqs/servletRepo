<%@page import="com.ciq.sms.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>
	<h1 align="center">Student Management Service</h1>

	<h2>

		<a href="sms-save.jsp" class="btn btn-primary">addStudent</a>

	</h2>
	<%
		List<Student> students = (List<Student>) request.getAttribute("students");
	%>


	<table id="customers">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Course</th>
			<th>Action</th>
		</tr>
		<%
			for (Student student : students) {
		%>
		<tr>
			<td><%=student.getId()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getFee()%></td>
			<td><%=student.getEmail()%></td>
			<td><a href="#">update</a></td>
			<td><a href="#">delete</a></td>
		</tr>

		<%
			}
		%>

	</table>
</body>
</html>