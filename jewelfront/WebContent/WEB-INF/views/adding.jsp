<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<jsp:include page="header.jsp"/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<div id="form3">
  <h2>Product Details</h2>
<hr/>
  <form action="addProducts" enctype="multipart/form-data">
    <div class="form-group">
      <label for="p_id">Product  ID :</label>
      <input type="number" class="form-control" id="p_id" placeholder="Enter Product ID" name="p_id" value="${product.p_id}">
    </div>
    <div class="form-group">
      <label for="p_name">Product Name :</label>
      <input type="text" class="form-control" id="p_name" placeholder="Enter Product Name " name="p_name" value="${product.p_name}">
    </div>
    <div class="form-group">
      <label for="p_desc">Product Description :</label>
      <input type="text" class="form-control" id="p_desc" placeholder="Enter Product Description " name="p_desc" value="${product.p_desc}">
    </div>
    <div class="form-group">
      <label for="p_price">Product Price :</label>
      <input type="number" class="form-control" id="p_price" placeholder="Enter Product Price " name="p_price" value="${product.p_price}">
    </div>
    
    
    <div class="form-group">
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
<div class="form-group">
  <label class="col-md-4 control-label" for="s_id" >Select Supplier</label>
  <div class="col-md-4">
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

<div class="form-group">
  <div class="col-md-4">
    <input id="filebutton" name="img" class="input-file" type="file">
  </div>
</div>
    <button type="submit" class="btn btn-default">ADD</button><button type="reset" class="btn btn-default">CANCEL</button>
  </form>
<br/>
<br/>
<hr/>
<br/>
</div>
<footer>
<jsp:include page="footer.jsp"/>
</footer>
</div>

</body>
</html>