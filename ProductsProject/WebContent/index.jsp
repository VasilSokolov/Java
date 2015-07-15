<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.*" %>
<%@ page import="entities.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products JSP-Servlet</title>
</head>
<body>
<% ProductModel pm = new ProductModel(); %>
<br>
<a href="add.jsp">Add new products</a>
	<table cellpadding="2" cellspacing="2" border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Option</th>
		</tr>	
		<c:forEach var="p" items="<%= pm.findAll() %>">
			<tr>
				<td>${p.id}</td>
				<td>${p.name }</td>
				<td>${p.price }</td>
				<td>
					<a href="ProductController?action=edit&id=${p.id }">Edit</a>
					<a href="ProductController?action=delete&id=${p.id }" onclick="return confirm('Are you sure?')">Delete</a>
				</td>
			</tr>
		</c:forEach>		
	</table>
</body>
</html>