<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>List Products</title>
</head>
<body>
	<h1>Listing roles</h1>
	<table border="1">
		<tr>
			<th>RoleId</th>
			<th>roleName</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${roles }" var="role">
			<tr>

				<td>${role.roleId}</td>
				<td>${role.roleName}</td>
				<td><a href="deleteProduct/${product.productId}">DELETE</a></td>
				<td><a href="editProduct/${product.productId}">EDIT</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>