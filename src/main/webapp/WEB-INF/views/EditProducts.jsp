<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editing Product</title>
</head>
<body>
<h1>Updating Product</h1>
	<form action="../updateProduct" method="post">
		<input type="hidden" value="${products.productId }" name="productId">
		ProductName: <input type="text" value="${products.productName }" name="productName"><br>
		<br> ProductPrice: <input type="text" value="${products.price}"name="price"><br>
		<br> ProductQty: <input type="text" value="${products.qty }"name="qty"><br>
		<br> <input type="submit" value="Update Product" />

	</form>
	<a href="listProducts">List Products</a>
</body>
</html>