<%@page import="com.vidvaan.ems.model.Employee"%>
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
		List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	    String msg = (String)request.getAttribute("msg");
	    msg = msg == null ? "":msg;
	%>
	
	<span style="color:green"><%=msg%></span>
	<table id="employees" border="1px">
		<tr>
			<th>Eid</th>
			<th>Ename</th>
			<th>Esal</th>
			<th>Delete Here</th>
			<th>Update Here</th>
		</tr>
		<%
			for (Employee employee : employees) {
		%>
		<tr>
			<td><%=employee.getEid()%></td>
			<td><%=employee.getEname()%></td>
			<td><%=employee.getEsal()%></td>
			<td><a href="./DeleteController?eid=<%=employee.getEid()%>">Delete</a></td>
		    <td><a href="./UpdateController?eid=<%=employee.getEid()%>">Update</a></td>
		</tr>

		<%
			}
		%>

	</table>
</body>
</html>