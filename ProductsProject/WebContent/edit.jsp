<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new products</title>
</head>
<body>
	<form method="post" action="ProductController?action=processedit">
		<table cellpadding="2" cellspacing="2">
			<tr>
				<td>Id</td>
				<td>${p.id }<input type="hidden" name="id" value="${p.id }"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${p.name }"></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price" value="${p.price }"></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><input type="text" name="quantity" value="${p.quantity }"></td>
			</tr>
			<tr>
				<td valign="top">Description</td>
				<td><textarea rows="5" cols="20" name="description">${p.description}</textarea></td>
			</tr>
			
			<tr>			
				<td>&nbsp;</td>
				<td align="left"><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form>
</body>
</html>