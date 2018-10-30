
<!DOCTYPE html>
<!-- <html xmlns="http://www.w3.org/1999/xhtml"
xmlns:th="http://www.thymeleaf.org"> -->
<html>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
<meta charset="utf-8" />
<title>cart table</title>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" 
type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-
awesome/4.7.0/css/font-awesome.min.css">
<script src="./resources/js/jquery.min.js"></script>
<script src="./resources/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="./resources/css/jquery.dataTables.min.css">
<script 
src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" 
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script 
src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script 
src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
</script>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-
awesome.min.css" rel="stylesheet">
<link href="./resources/css/loginpage.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<jsp:include page="header.jsp"/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<div class="container">
<div class="row">
   
   <p></p>
   <h1>ViewCartDetails</h1>   
   <p> </p><p> </p>
   
       <div class="col-md-10 col-md-offset-1">
           <div class="panel panel-default panel-table">
             <div class="panel-heading">
               <div class="row">
                 <div class="col col-xs-6">
                   <h3 class="panel-title">ViewCartDetails</h3>
                 </div>
                 <div class="col col-xs-6 text-right">
                   
                 </div>
               </div>
             </div>
             <div class="panel-body">
               <table class="table table-striped table-bordered table-list">
            <thead>
                   <tr>
                       
                       <th><em class="fa fa-cog"></em></th>
                       <th>Name</th>
                       <th>Price</th>
                       <th>Quantity</th>
                       
                       <th>Total</th>
                                                                                
                   </tr> 
                 </thead>
                 <tbody>
                          <c:set var="tot" value="0"></c:set>
                         <c:forEach items="${cartlist}" var="p">
                         <c:set var="t" value="${p.prices*p.quantity}"></c:set>
                 <c:set var="tot" value="${tot+t }"/>
                         <tr>
                         <%-- <td>
                             <a class="btn btn-default" href="./product_edit?
id=${p.productid}"><em class="fa fa-pencil"></em></a>--%>
                            <td> <a class="btn btn-danger" href="./cart_delete?id=${p.cartid}"><em class="fa fa-trash"></em></a></td>
                           
                           <%-- <td class="hidden-xs">${p.productid}</td> --%>
                           <td>${p.productid.p_name}</td>
                          <td><i class="fa fa-inr" aria-hidden="true" required="required">${p.prices}</i></td>     
                           <td>${p.quantity}</td>    
                         
                           <td><i class="fa fa-inr" aria-hidden="true"> ${p.prices*p.quantity}</i></td>
                           <%-- <td><img src="./resources/product/${p.p_image}" 
class="img-rounded" alt="" width="75px" height="50px"/></td>          --%>
                            
                           <tr>       
                         </c:forEach>
                       </tbody>
               </table>
           
             </div>
             <div class="panel-footer">
               <div class="row">
                 <a href="customerDetails?tot=<c:out value="${tot}"/>">Continue Shopping</a>
                  <h4 style="color:#7FFF00;">Grand Total = <c:out value="${tot}"/></h4> 
                 </div>
                 <div class="col col-xs-8">
                   
                   
                 </div>
               </div>
             </div>
           </div>
</div></div>
</div>
    
</body>
</html>