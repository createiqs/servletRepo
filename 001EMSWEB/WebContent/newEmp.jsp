<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"></script>
</head>
<body>
	<h1>New Employee</h1>
	<form action="./InsertController" method="post">
		<table>
			<tr>
				<td>Eno</td>
				<td><input type="text" name="eno"></td>
			</tr>
			<tr>
				<td>Ename</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>Esal</td>
				<td><input type="text" name="esal"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
				<td><input type="reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>