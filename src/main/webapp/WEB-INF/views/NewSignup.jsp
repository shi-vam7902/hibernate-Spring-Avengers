<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up Page</title>
</head>
<body>
	<form action="saveuser" method="post">
		<br>
		<br> FirstName:<input type="text" name="firstName"><br>
		<br> LastName:<input type="text" name="lastName"><br>
		<br> Email:<input type="text" name="email"><br> <br>
		Password:<input type="text" name="password"><br> <br>
		 <input
			type="submit" value="Save User"> <br>
	</form>
	<a href="users">List Users</a>
</body>
</html>