<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editing Users</title>
</head>
<body>
<form action="../updateuser" method="post">
		<br><input type="hidden"  value="${users.userId}" name="userId">
		<br> FirstName:<input type="text" name="firstName" value="${users.firstName }"><br>
		<br> LastName:<input type="text" name="lastName"  value="${users.lastName }"><br>
		<br> Email:<input type="text" name="email"  value="${users.email }"><br> <br>
		Password:<input type="text" name="password" value="${users.password}"><br> <br>
		 <input
			type="submit" value="EditUser"> <br>
	</form>
	<a href="users">List Users</a>
</body>
</html>