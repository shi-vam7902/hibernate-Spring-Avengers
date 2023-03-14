<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>listing users</title>
</head>
<body>
	<h1>Listing Users</h1>
	<table border="1">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Password</th>
			<!-- <th>Role</th> -->
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${users }" var="u">
			<tr>

				<td>${u.userId}</td>
				<td>${u.firstName}</td>
				<td>${u.lastName}</td>
				<td>${u.email}</td>
				<td>${u.password}</td>
				<!--  <td>${u.firstName}</td>-->
				<td><a href="deleteuser/${u.userId}">DELETE</a></td>
				<td><a href="edituser/${u.userId}">EDIT</a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>