<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listing Developers here</title>
</head>
<body>
<h1>Listing Developers</h1>
	<table border="1">
		<tr>
			<th>Developer's Id</th>
			<th>Developer's Name</th>
			<!-- <th>Role</th> -->
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${devs }" var="d">
			<tr>

				<td>${d.devId}</td>
				<td>${d.devName}</td>
				<!--  <td>${u.firstName}</td>-->
				<td><a href="deletedev/${d.devId}">DELETE</a></td>
				<td><a href="editdev/${d.devId}">EDIT</a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>