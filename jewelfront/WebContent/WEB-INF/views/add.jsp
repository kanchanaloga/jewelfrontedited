<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
       <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/> -->
<script type="text/javascript" src="./resources/js/jquery-3.2.1.min.js"></script> 
<title>Add project</title>
<style type="text/css">
#form1{
width:600px;
height: 280px;

position: relative;
left: 450px;
}
#form2{
width:600px;
height: 280px;

position: relative;
left: 450px;
}
#form3{
width:600px;
height: 280px;

position: relative;
left: 450px;
}
#panel1{
width:300px;
height: 800px;
display: inline;
border: 3px solid black;
padding: 250px 150px;
position: relative;
top: 250px;
background-color: black;
color: silver;

}
#cat{
position: absolute;
top: 120px;
left: 20px;
}
#product{
position: absolute;
top: 20px;
left: 20px;
}
#supp{
position: absolute;
top: 220px;
left: 20px;
}
#b3{
position: absolute;
top: 300px;
left: 20px;
padding: 10px 40px;
}
#b2{
position: absolute;
top: 180px;
left: 20px;
padding: 10px 40px;
}
#b1{
position: absolute;
top: 80px;
left: 20px;
padding: 10px 40px;
}
</style>
<script type="text/javascript">

$(document).ready(function() {
   $("#form1").hide();
   $("#form2").hide();
   $("#form3").hide();

   $("#b1").click(function() {
   	 $("#form1").hide();
   	   $("#form2").hide();
   	   $("#form3").show();
   	   
   });
   
   $("#b2").click(function() {
 	 $("#form1").show();
 	   $("#form2").hide();
 	   $("#form3").hide();
 });
   
   $("#b3").click(function() {
 	 $("#form1").hide();
 	   $("#form2").show();
 	   $("#form3").hide();
 });
   

});

</script>
<script>
function dialog()
{
	
	if (window.confirm('Confirm Your Data Adding?'))

	{

	    alert('Your Data Successfully');


	}

	else

	{

	    die();

	}
	
	}


</script>


</head>
<body>
<div class="container">
<%-- <div>
        <div class="col-md-12 bg-danger">
            <%@include file="header.jsp" %>
        </div>
        <div class="col-md-3 bg-info" style="height: 300px;">
            <%@include file="footer.jsp" %>
        </div>
        <div class="col-md-9 bg-primary" style="height: 300px;">
            <%@include file="header.jsp" %>
        </div>
        <div class="col-md-12 bg-success">
            <%@include file="footer.jsp" %>
        </div>
    </div> --%>
<jsp:include page="header.jsp"/>
<a href="supplierlist">Supplier</a>

<a href="categorylist">Category</a>

<a href="productlist">Product</a>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<div id="panel1" style="background:#8A2BE2;">
<label id="product"><h1>PRODUCT</h1></label>
<button id="b3">ADD</button>
<label id="cat"><h1>CATEGORY</h1></label>
<button id="b1">ADD</button>
<label id="supp"><h1>SUPPLIER</h1></label>
<button id="b2">ADD</button>



</div>
<div id="form1" style="background:#B8860B;">
<h2>Category Details</h2>
<hr/>
  <form action="addCategory">
    <div class="form-group">
      <label for="c_id">Category  ID :</label>
      <input type="text" class="form-control" id="c_id" placeholder="Enter Category ID" name="c_id" required="required">
    </div>
    <div class="form-group">
      <label for="c_name">Category Name :</label>
      <input type="text" class="form-control" id="c_name" placeholder="Enter Category Name " name="c_name" required="required">
    </div>   
    <button type="submit" class="btn btn-default" onclick="dialog()">Submit</button>
  </form>
<br/>
</div>

<div id="form2" style="background:#8FBC8F"; >
<hr/>
<h2>Supplier Details</h2>
<hr/>
   <form action="suppliercategory">
    <div class="form-group">
      <label for="s_id">SUPPLIER ID:</label>
      <input type="text" class="form-control" id="s_id" placeholder="Enter supplier id" name="s_id" required="required">
    </div>
    <div class="form-group">
      <label for="s_name">SUPPLIER NAME</label>
      <input type="text" class="form-control" id="s_name" placeholder="Enter supplier name " name="s_name" required="required">
    </div>   
    <button type="submit" class="btn btn-default" onclick="dialog()">Submit</button>
  </form>
</div>

<div id="form3" style= "background: #FF00FF; ">
  <h2>Product Details</h2>
<hr/>
  <form action="addProducts" method="post"  enctype="multipart/form-data">
    <div class="form-group">
      <label for="p_id">Product  ID :</label>
      <input type="number" class="form-control" id="p_id" placeholder="Enter Product ID" name="p_id" required="required">
    </div>
    <div class="form-group">
      <label for="p_name">Product Name :</label>
      <input type="text" class="form-control" id="p_name" placeholder="Enter Product Name " name="p_name" required="required">
    </div>
    <div class="form-group">
      <label for="p_desc">Product Description :</label>
      <input type="text" class="form-control" id="p_desc" placeholder="Enter Product Description " name="p_desc" required="required">
    </div>
    <div class="form-group">
      <label for="p_price">Product Price :</label>
      <input type="number" class="form-control" id="p_price" placeholder="Enter Product Price " name="p_price" required="required">
    </div>
    
    
    <div class="form-group" style= "background: #FF00FF; " >
  <label class="col-md-4 control-label" for="c_id" >Select Category</label>
  <div class="col-md-4">
    <select id="c_id" class="form-control" name="c_id">
      <c:forEach var="clist" items="${clist}">

                <option value="${clist.c_id}">${clist.c_name}</option>

            </c:forEach>
    </select>
  </div>
</div>
<br/>
<br/>
<div class="form-group" style= "background: #FF00FF; " >
  <label class="col-md-4 control-label" for="s_id" >Select Supplier</label>
  <div class="col-md-4" style= " background: #FF00FF; ">
    <select id="s_id" class="form-control" name="s_id">
      <c:forEach var="slist" items="${slist}">

                <option value="${slist.s_id}">${slist.s_name}</option>

            </c:forEach>
    </select>
  </div>
</div>
<br/>
<br/>
<br/>

<div class="form-group" style= "background: #FF00FF; ">
      <label for="img">Upload Image:</label>
      <input type="file" id="img" name="file">
    </div>
    <button type="submit" class="btn btn-primary"  onclick="dialog()" >Save</button><button type="reset" class="btn btn-default">CANCEL</button> 
  </form>
</div>
< <!--  <button type="submit" class="btn btn-default">ADD</button><button type="reset" class="btn btn-default">CANCEL</button>  -->
  </form>
<br/>
<br/>
<hr/>
<br/>
</div>
<%-- <jsp:include page="footer.jsp"/> --%>
</div>

 

</body>
</html>