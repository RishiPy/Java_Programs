<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ page isELIgnored="false" %>
</head>
<body>
<h1>Inserted Successfully!</h1>
 <table>
               <thead><tr>
                <th>No</th>
                <th>Name</th>
                <th>Description</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="product" items="${productlist}">
                    <tr>
                    <td>${product.pid}</td>
                    <td>${product.pname}</td>
                    <td>${product.pdesc}</td>
                    </c:forEach>   
                </tbody>          
            </table>
</body>
</html>