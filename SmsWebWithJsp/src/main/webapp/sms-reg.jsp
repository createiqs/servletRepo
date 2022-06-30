<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
</style>
</head>
<body>
		<h1 align="center">Student Registration Form</h1>


		<div class="m-4">
			<form action="register" method="post">
				<div class="mb-3">
					<label class="form-label" for="inputEmail">Name</label> <input
						type=text " name="name" class="form-control" id="inputEmail"
						placeholder="enter name" required>
				</div>
				<div class="mb-3">
					<label class="form-label" for="inputEmail">email</label> <input
						type=text " name="email" class="form-control" id="inputEmail"
						placeholder="enter email id" required>
				</div>
				<div class="mb-3">
					<label class="form-label" for="inputEmail">course Name</label> <input
						type=text " name="course" class="form-control" id="inputEmail"
						placeholder="enter course name" required>
				</div>


				<div class="m-4">
					<input type="submit" value="save" class="btn btn-primary"> 
				</div>
			</form>

		</div>
</body>
</html>