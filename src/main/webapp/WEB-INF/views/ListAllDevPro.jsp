<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assigned Projects</title>
</head>
<body>
	<h1>Listing Users</h1>
	<table border="1">
		<tr>
			<th>Unique Project And Developer Id</th>
			<th>DeveloperId</th>
			<th>DeveloperName</th>
			<th>ProjectId</th>
			<th>projectName</th>
			<!-- <th>Role</th> -->
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${devpros }" var="dp">
			<tr>

				<td>${dp.devproId}</td>
				<td>${dp.devId}</td>
				<td>${dp.devName}</td>
				<td>${dp.projectId}</td>
				<td>${dp.projectName}</td>
				<!--  <td>${u.firstName}</td>-->
				<td><a href="deleteuser/${dp.devproId }">DELETE</a></td>
				<td><a href="edituser/${dp.devproId}">EDIT</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>