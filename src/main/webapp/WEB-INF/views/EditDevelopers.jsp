<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Developer  here</title>
</head>
<body>

<form action="../updatedev" method="post">
		<br><input type="hidden"  value="${devs.devId}" name="devId">
		<br> Developer'sName:<input type="text" name="devName" value="${devs.devName }"><br>
		 <input
			type="submit" value="Update Developer"> <br>
	</form>
	<a href="listdevs">List Developers</a>

</body>
</html>