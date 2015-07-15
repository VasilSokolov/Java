<%-- 
    Document   : index
    Created on : May 11, 2015, 12:10:22 PM
    Author     : 123
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Warehouse Items</title>
    </head>
    <body>
        <table border="1">
            <td><a href="warehouseItem.jsp">Warehouse Items</a></td>
            <td><a href="${pageContext.request.contextPath}/AllItems">All Items</a></td>            
        </table>
        <br />

        <form action="${pageContext.request.contextPath}/ItemsServlet" method="POST">
            <table>
                <tr>
                    <td>Item ID:</td>
                    <td><input type="text" name="id" value="${item.itemId}"/></td>
                </tr>
                <tr>
                    <td>Type:</td>
                    <td><input type="text" name="name" value="${item.type}"/></td>
                </tr>
                <tr>
                    <td>Availability:</td>
                    <td><input type="text" name="address" value="${item.availability}" /></td>
                </tr>
                <tr>
                    <td>Accountable Person:</td>
                    <td><input type="text" name="address" value="${item.accountablePerson}" /></td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><input type="text" name="address" value="${item.price}" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="Submit" name="operation" value="Add" />
                    <input type="Submit" name="operation" value="Edit" />
                    <input type="Submit" name="operation" value="Delete" />
                    <input type="Submit" name="operation" value="Search" /></td>
                </tr>                
            </table>
        </form>
    </body>
</html>
