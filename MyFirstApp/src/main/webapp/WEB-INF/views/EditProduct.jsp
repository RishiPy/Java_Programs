<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <html>
  <head></head>
  <body>
          
       <form:form modelAttribute="cmd" method="post" action="/MyFirstApp/Save">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="pid" /></td>  
         </tr>   
         <tr>    
          <td>Product Name : </td>   
          <td><form:input path="pname"  /></td>  
         </tr>    
         <tr>    
          <td>Description :</td>    
          <td><form:input path="pdesc" /></td>  
         </tr>   
         <tr>             
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form> 
       </body>
       </html>