


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:c="http://java.sun.com/jstl/core" xmlns:ui="http://java.sun.com/jsf/facelets">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Table</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

<h2>All Product in System</h2>
 
    <table border="1">
        <tr>
            <th>Product Name</th>
            
        </tr>
        <c:forEach begin="1" end="10" var="i">
            <tr>
                <td>${i}</td>
                
            </tr>
        </c:forEach>
    </table>
    <jsp:include page="footer.jsp"/>

</body>
</html>