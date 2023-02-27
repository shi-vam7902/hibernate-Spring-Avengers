<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editing Product</title>
</head>
<body>
<h1>Updating Product</h1>
	<form action="updateProduct" method="post">
		ProductName: <input type="text" name="${products.productName }"><br>
		<br> ProductPrice: <input type="text" name="${products.price}"><br>
		<br> ProductQty: <input type="text" name="${products.qty }"><br>
		<br> <input type="submit" value="Update Product" />

	</form>
	<a href="listProducts">List Products</a>
</body>
</html>