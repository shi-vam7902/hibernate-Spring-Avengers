<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home Works</h1>
<h2>Welcome ${emp.name }</h2>
<form action="saveaddress" method="post">
	AddressLine : <input type="text" name="addressLine"><br><br>
	City:<input type="text" name="city"><br><br>
	<input type="submit" value="AddcAddress"> 
</form>
</body>
</html>