<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Developer here</title>
</head>
<body>
<h1>Add Developer</h1>
<form action="savedev" method="post">
	Enter Developer's Name: <input type="text" name="devName"><br>
	<input type="submit" value="Add Developer"><br>
	<a href="listdevs">Listing Developers</a>
	<a href="listpros">Listing Projects</a>
</form>
</body>
</html>