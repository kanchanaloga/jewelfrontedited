<%@page import="com.niit.jee.model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@page isELIgnored="false"  %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List" %>
<%@page import="com.niit.jee.model.Category" %>
<%@page import="com.niit.jee.model.Supplier" %>
  

<title> Product Edit</title>
</head>
<body>
<div class="container">
<div class="row">
<h2>Edit Product Details</h2>
<hr/>
  <h2>Add Product</h2>
  <%
                 Product p=(Product)request.getAttribute("product");
                 %>
<form  action="product_update" method="post"  enctype="multipart/form-data">
            
 <div class="container">
    <label><b>Product Id</b></label>
    <input type="text" name="pId" value="<%=p.getP_id() %>"  style="width:350px;display:block;">
    <label><b>Product Name</b></label>
    <input type="text" name="pn" value="<%=p.getP_name() %>"  style="width:350px;display:block;">
    
    <!-- DropDown input-->

     
     
     
     
    <label><b>Product Category</b></label>   
  <select class="form-control form-control-lg" id="selectedRecord" name="pc">
             <option>Select Category</option>
             <%
                 List<Category> clist=(List<Category>) request.getAttribute("clist");
                for(Category c : clist){
                    out.println("<option value='"+ c.getC_id()+"'>"+ c.getC_name()+ "</option>");
                }
                
             %>
             </select>
             
             
             
             
    
    
<%--      <label><b>Product Category</b></label>  
     <select class="form-control form-control-lg" name="procategory">
                                <option>Select Category</option>
                                <c:forEach var="cList" items="${clist}">

                                    <option value="${cList.c_id}">${cList.c_name}</option>

                                </c:forEach>
                            </select>  
                             --%><br>
                             
                 <label class="col-md-4 control-label" for="ln">Supplier Category</label>  
                 
                 
  <div class="col-md-4">
  <select class="form-control form-control-lg" id="selectedRecord" name="psc">
             <option>Select Supplier</option>
             <%
                 List<Supplier> slist=(List<Supplier>) request.getAttribute("slist");
                for(Supplier s : slist){
                    out.println("<option value='"+s.getS_id()+"'>"+ s.getS_name() + "</option>");
                }
                
             %>
             </select>             
                             
                             
                             
                             
                             
                             
                             
    <%-- <label><b>Product Supplier</b></label>         
    <select class="form-control form-control-lg"
                                name="productsupplier">
                                <option>Select Supplier</option>
                                <c:forEach var="slist" items="${slist}">

                                    <option value="${slist.s_id}">${slist.s_name}</option>

                                </c:forEach>
                            </select> --%> <br>    
      <label><b>Product Price</b></label>
    <input type="text" name="pp" value="${p.p_price}"  style="width:350px;display:block;"></input>
    
     File to upload:
    <label><b>Product Image</b></label>
    <input type="file" name="file" value="${p.p_image}" id="file" style="width:350px;display:block;"></input>
     

        
                            
  <input type="submit" value="Add">
     
  <input type="submit" value="Cancel">
  </div>
                    
</form>
          
           

</div></div>
    
  <%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>
</body>
</html>
