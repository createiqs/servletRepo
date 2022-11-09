<%@page import="com.ciq.sms.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>saved student form data</h1>

	<%
		Student student = (Student) request.getAttribute("save");

	out.println(student);
	%>
</body>
</html>