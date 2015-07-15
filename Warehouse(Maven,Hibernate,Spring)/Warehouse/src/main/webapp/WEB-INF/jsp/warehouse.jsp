<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Warehouse Management</title>
</head>
<body>
<h1>Warehouse Data</h1>
        <h1>Warehouse Data</h1>
        <form:form action ="warehouse.do" method="POST" commandName="warehouse">
            <table>
                <tr>
                    <td>ID</td>
                    <td><form:input path="id"/></td>
                </tr>
                <tr>
                    <td>Employee Name</td>
                    <td><form:input path="employee_name"/></td>
                </tr>
                <tr>
                    <td>Company Name</td>
                    <td><form:input path="company_name"/></td>
                </tr>
                <tr>
                    <td>Article</td>
                    <td><form:input path="article"/></td>
                </tr>
                <tr>
                    <td>Article Number</td>
                    <td><form:input path="article_number"/></td>
                <tr>
                    <td>Price</td>
                    <td><form:input path="price"/></td>
                </tr>
                <tr>
                    <td>Delivery Date</td>
                    <td><form:input path="delivery_date"/></td>
                </tr>
                <tr>
                    <td>Servant</td>
                    <td><form:input path="servant"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Add"/>
                        <input type="submit" name="action" value="Edit"/>
                        <input type="submit" name="action" value="Delete"/>
                        <input type="submit" name="action" value="Search"/>
                    </td>
                </tr>
            </table>
        </form:form>
        <br>
        <table border="1">
            <th>ID</th>
            <th>Employee Name</th>
            <th>Company Name</th>
            <th>Article</th>
            <th>Article Number</th>
            <th>Price</th>
            <th>Delivery Date</th>
            <th>Servant</th>
        <c:forEach items="${warehouseList}" var="warehouse">
            <tr>
                <td>${warehouse.id}</td>  
                <td>${warehouse.employee_name}</td> 
                <td>${warehouse.company_name}</td> 
                <td>${warehouse.article}</td>  
                <td>${warehouse.article_number}</td>    
                <td>${warehouse.price}</td>    
                <td>${warehouse.delivery_date}</td>    
                <td>${warehouse.servant}</td>                   
            </tr>                
        </c:forEach>    
</table>
</body>
</html>