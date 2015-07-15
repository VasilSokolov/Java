<%-- 
    Document   : allstudents
    Created on : Aug 22, 2011, 9:51:32 PM
    Author     : bagnes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Items</title>
    </head>
    <body>
        <table border="1">
            <td><a href="itemsinfo.jsp">Items Info</a></td>
            <td><a href="allitems.jsp">All Items</a></td>            
        </table>
        <br />
        <h3>List of Items</h3>
        <br />
        <table border="1">
            <th>Item ID</th>
            <th>Type</th>
            <th>Availability</th>
            <th>Accountable Person</th>
            <th>Price</th>
            <c:forEach items="${requestScope.list}" var="item">
                <tr>
                    <td><a href="${pageContext.request.contextPath}/GetItem?id=${item.itemId}">${item.itemId}</a></td>
                    <td>${item.type}</td>
                    <td>${item.availability}</td>
                    <td>${item.accountablePerson}</td>
                    <td>${item.price}</td>
                </tr>
            </c:forEach>                 
        </table>
    </body>
</html>
