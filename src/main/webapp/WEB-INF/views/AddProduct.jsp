<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Products</title>
</head>
<body>
	<h1>Add Products</h1>
	<form action="saveproduct" method="post">
		ProductName: <input type="text" name="productName"><br>
		<br> ProductPrice: <input type="text" name="price"><br>
		<br> ProductQty: <input type="text" name="qty"><br>
		<br> <input type="submit" value="Add Product" />

	</form>
	<a href="listProducts">List Products</a>
</body>
</html>