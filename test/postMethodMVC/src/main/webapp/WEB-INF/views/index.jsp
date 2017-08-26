<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="https://bootswatch.com/united/bootstrap.min.css">
	<title>Post MVC Example</title>
</head>
<body>
<form action="" method="POST">
	<table>
		<tr>
			<td> <label>Número 1:</label> </td>
			<td><input type="text" name="numer1" value="${numer1}"></td>
		</tr>
		<tr>
			<td><label>Número 2:</label> </td>
			<td><input type="text" name="numer2" value="${numer2}"></td>
		</tr>
		<tr>
			<td><input type="submit" name="Sumar"></td>
		</tr>
	</table>
</form>
${suma}
</body>
</html>