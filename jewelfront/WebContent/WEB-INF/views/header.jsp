<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>header</title>
<meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
<body>
<%-- <header>
 

<div class="navbar navbar-default navbar-fixed-top" style="max-height:100px;">
    <div class="container" style="max-height:100px;">

        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class ="navbar-brand" rel="home" href="#" title=" can buy & leave">
                <img style="max-width:50px; margin-top: 5px;"
                     src="./resources/images/logo2.png"/>
            </a>
        </div>
        
        
        <div id="navbar" class="collapse navbar-collapse navbar-responsive-collapse" style="max-height:100px;">
            <ul class="nav navbar-nav">
            <nav class="navbar navbar-light" style="background-color: #e3f2fd;">
            
            
                <li class="dropdown">
                
                    <a href="add"  class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Jewellery Category <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="productlist">Product List</a></li>
                        <li><a href="categorylist">Category List</a></li>
                        <li><a href="supplierlist">Supplier List</a></li>
                        </ul>
                         </li>
                         
                         <li class="dropdown">
                
                    <a  class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">select Category of your choice <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <c:forEach var="clist" items="${list}">

								<li><a href="productFilter?id=${ clist.c_id}">${clist.c_name}</ a></li>              					
								</c:forEach>
                        </ul>
                         </li>
                       
                     <a href="<c:url value="add" />">" role="button">ADMIN RIGHTS[ADD]</a>
                       
                       <li class="dropdown-header">Select your Category</li>

							<c:forEach var="clist" items="${catalist}">

								<li><a href="productFilter?id=${ clist.c_id}">${clist.c_name}</ a></li>              					
								</c:forEach>
                       
                </nav>
                     
                        
 
       
            
			<form class="navbar-form navbar-right" role="search" method="get" id="searchform" action="controller1" style="max-height:100px;">
				<div class="form-group" style="max-height:100px;size: landscape;" >
				<p>
        <a href="registration" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-user"></span> sign up 
        </a>
      </p> 
    
     
      <p>
        <a href="login" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-log-in"></span> Log in
        </a>
      </p></div>
      
      
				</form>
				          
<div class="container" style="max-height:100px;">
  <h2 style="text-align:center;table-layout: fixed;">shopping dac jewellery </h2>
  </div>
</div>
		</div>
	</div>

    </div>

</header>  --%>
 <header>
<nav class="navbar navbar-default"  style="background:  #9ACD32 ;">
	<div class="container-fluid">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
							
			<a class="navbar-brand" href="./">				
				<%-- <img src='<c:url value="./resources/images/shopdac1.png" />' width="50px" height="25px" class="img-responsive"/> --%>
				<img src="${pageContext.request. contextPath}/resources/images/shopdac1.png"  width="50px" height="25px" class="img-responsive"/>
				
			</a>
		</div>		
		
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Products <span class="caret"></span></a>
					<ul class="dropdown-menu">
					       <c:forEach var="clist" items="${list}">

								<li><a href="productFilter?id=${ clist.c_id}">${clist.c_name}</ a></li>              					
								</c:forEach>
								</li>
							</ul>
					 					<li class="dropdown">
                
                    <a href="add"  class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">ADMIN PROCESS LIST<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="admin/productlist">Product List</a></li>
                        <li><a href="admin/categorylist">Category List</a></li>
                        <li><a href="admin/supplierlist">Supplier List</a></li>
                        </ul>
                         </li>
				</li>
					<li><a href="<c:url value="admin/add"/>" role="button" aria-haspopup="true"
					aria-expanded="false">Add</a></li>
					
					
			</ul>
		
                 </ul>
			  <ul class="nav navbar-nav navbar-right">
			  <c:if test="${pageContext.request.userPrincipal.name == null }">
					<li>
					<a href=' <c:url value="/login" />'>Login</a>
					</li>
				<li><a href="registration">Signup</a></li>
				
				</c:if>
				<c:if test="${pageContext.request.userPrincipal.name  != null}">
                               <li><a>Welcome: ${pageContext.request.userPrincipal.name}</a></li>
	              				<li><a href='<c:url value="/logout" />'>Signout</a></li>
	              				<!-- <li><a href="logout">Signout</a></li> -->
                 </c:if>
				
				</ul>
		</div>		
	</div>
</nav>
</header>
</body>
</html>