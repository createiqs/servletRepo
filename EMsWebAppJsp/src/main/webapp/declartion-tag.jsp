<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Declartion Tag</h1>
	<%!int a = 10;
	int b = 20;
	int total = a + b;%>
	total of two numbers:

	<h2>Scriplet tag</h2>
	<%
		out.println(total);

		for (int i = 0; i <= 5; i++) {
			out.println("<br/>createiq" + i);
		}
	%>
</body>
</html>