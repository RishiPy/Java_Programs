<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Product List</h1>
<table border="2">
<tr><th>ID</th><th>NAME</th><th>DESCRIPTION</th><th colspan="2">MODIFIED</th></tr>
 <c:forEach var="pro" items="${list}">
 <tr>
        <td>  ${pro.id}</td>
        <td>  ${pro.name} </td>
        <td>  ${pro.description}  </td>
        
        <td><a href="editpro/${pro.id}">Edit</a></td>
        <td><a href="deletepro/${pro.id}">Delete</a></td>
 </tr>
   </c:forEach>
</table>
</body>
</html>