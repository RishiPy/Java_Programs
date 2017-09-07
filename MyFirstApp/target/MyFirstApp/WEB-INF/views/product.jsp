<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page isELIgnored="false" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="add" modelAttribute="cmd" method="post">
<form:label path="pname">Product Name</form:label>
<form:input path="pname"/>
<form:label path="pdesc">Product Description</form:label>
<form:input path="pdesc"/>
<input type="submit" value="Add Product">
</form:form>


<table border="1" cellpadding="5" cellspacing="2">
               <thead><tr>
                <th>No</th>
                <th>Name</th>
                <th>Description</th>
                 <th>Options</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="product" items="${productlist}">
                    <tr>
                    <td>${product.pid}</td>
                    <td>${product.pname}</td>
                    <td>${product.pdesc}</td>
                    <td>
                    <a href="delete/${product.pid}">Delete</a>
                    </td>
                    </c:forEach>   
                </tbody>          
            </table>
</body>
</html>