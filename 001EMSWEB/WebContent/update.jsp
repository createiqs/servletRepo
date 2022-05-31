<!DOCTYPE html>
<%@page import="com.vidvaan.ems.model.Employee"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"></script>
</head>
<body>
	<h1>New Employee</h1>
	<form action="./UpdateController" method="post">

		<%
			Employee employee = (Employee) request.getAttribute("employee");
		%>
		<table>
			<tr>
				<td>Eno</td>
				<td><input type="text" name="eno"
					value="<%=employee.getEid()%>" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Ename</td>
				<td><input type="text" name="ename"
					value="<%=employee.getEname()%>"></td>
			</tr>
			<tr>
				<td>Esal</td>
				<td><input type="text" name="esal"
					value="<%=employee.getEsal()%>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
				<td><input type="reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>