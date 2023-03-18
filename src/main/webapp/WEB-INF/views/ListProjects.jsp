<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Listing Projects</h1>
	<table border="1">
		<tr>
			<th>Project's Id</th>
			<th>Project's Name</th>
			<th>Project's Technology</th>
			<!-- <th>Role</th> -->
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${pros }" var="p">
			<tr>

				<td>${p.projectId}</td>
				<td>${p.projectName}</td>
				<td>${p.techName}</td>
				<!--  <td>${u.firstName}</td>-->
				<td><a href="deletepro/${p.projectId}">DELETE</a></td>
				<td><a href="editpro/${p.projectId}">EDIT</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>