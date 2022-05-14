<%@page import="com.vidvaan.ems.model.Employee"%>
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

	<%
		List<Employee> employees = (List<Employee>) request.getAttribute("emps");
	%>

	<table id="customers">
		<tr>
			<th>EID</th>
			<th>ENAME</th>
			<th>SALARY</th>
			<th>EMAIL</th>
		</tr>
		<%
			for (Employee employee : employees)

			{
		%>

		<tr>
			<td><%=employee.getEid()%></td>
			<td><%=employee.getEname()%></td>
			<td><%=employee.getEsal()%></td>
			<td><%=employee.getEmail()%></td>
		</tr>
		<%
			}
		%>

	</table>

</body>
</html>