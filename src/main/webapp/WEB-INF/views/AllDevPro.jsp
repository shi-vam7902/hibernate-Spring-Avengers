<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Dev Pro Adding Jsp</title>
</head>
<body>
	<h1>Assigning Projects and Developers</h1>
	<form action="saveass" method="post">

		Please Assign Developers: <select name="devId">
			<option>Select Developer's Id</option>
			<c:forEach items="${devs}" var="d">
				<option value="${d.devId}">${d.devName}</option>
			</c:forEach>

		</select> <br>
		<br> Please Assign Projects: <select name="projectId">
			<option>Select Developer's Id</option>
			<c:forEach items="${pros}" var="d">
				<option value="${d.projectId}">${d.projectName}</option>
			</c:forEach>

		</select> <br>
		<br> <input type="submit" value="ASSIGN"><br>
		<br> <a href="listdevspros">List All Developers and
			AssignedProjects</a>

	</form>
</body>
</html>