<%@page import="com.creatieiq.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}
</style>
</head>
<body>
	<h1>List of employees</h1>

	<%
		List<Employee> emps = (List<Employee>) request.getAttribute("empAll");
	%>

	<table id="customers" , aliegn="center">
		<tr>
			<th>EID</th>
			<th>FIRSTNAME</th>
			<th>LASTNAME</th>
			<th>SALARY</th>
			<th>AGE</th>
			<th>DATEOFJOINING</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>
		<%
			for (Employee employee : emps)

			{
		%>

		<tr>
			<td><%=employee.getId()%></td>
			<td><%=employee.getFirstName()%></td>
			<td><%=employee.getLastName()%></td>
			<td><%=employee.getSalary()%></td>
			<td><%=employee.getAge()%></td>
			<td><%=employee.getDoj()%></td>
			<td><a href>update</a></td>
			<td><a href>delete</a></td>
		</tr>


		<%
			}
		%>
	
</body>
</html>