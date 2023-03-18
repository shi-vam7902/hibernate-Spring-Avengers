<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Projects here</title>
</head>
<body>

<form action="../updatepro" method="post">
		<br><input type="hidden"  value="${pros.projectId}" name="projectId"><br>
		<br> Project'sName:<input type="text" name="projectName" value="${pros.projectName }"><br>
		<br> TechName'sName:<input type="text" name="techName" value="${pros.techName }"><br>
		 <input
			type="submit" value="Update Project"> <br>
	</form>
	<a href="listpros">List Projects</a>

</body>
</html>