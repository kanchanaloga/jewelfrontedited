 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Latest compiled and minified CSS -->

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">




<!-- jQuery library -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>




<!-- Latest compiled JavaScript -->

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>login</title>

</head>

<body>
<header>
<jsp:include page="header.jsp"></jsp:include>
</header>



<h2>Login </h2> 




<div class="container" style="padding:50px 0">

	<div class="row"></div>

	<!-- Main Form -->

	<div class="l">

	<c:url var="loginUrl" value="/j_spring_security_check" />

	

		<form id="login-form" name="formLogin" action="${loginUrl}"  method="post" class="text-left">

			<div class="login-form-main-message"></div>

			<div class="main-login-form">

				<div class="login-group">

					<div class="form-group">

						<label for="lg_username" class="sr-only">Username</label>

						<input type="text" class="form-control" id="lg_username" name="j_username" placeholder="username"  required="required">

					</div>

					<div class="form-group">

						<label for="lg_password" class="sr-only">Password</label>

						<input type="password" class="form-control" id="lg_password" name="j_password" placeholder="password" required="required">

					</div>




				</div  style="background-color: #FF1493 ;">

				<!-- <button type="submit" class="login-button">Login</button> -->

				<input type="submit" name="submit" value="Login"/>

			</div>

			 <input type="hidden" name="${_csrf.parameterName}"

			value="${_csrf.token}" />

		</form>

		</div>

		</div>







  <div class="container" style="background-color: #FF1493 ;">

    <button type="button" class="cancelbtn">Cancel</button>

    <span class="psw">New User <a href="#">Register</a></span>

  </div>

</form>

    <footer>
<jsp:include page="footer.jsp"></jsp:include>

</footer>

</body>

</html> 





<%-- 
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
    <div class="row">
        <div class="form_bg">
            <form action="index" method="get" >
                 <h2 class="text-center">Login Page</h2>
                <br/>
                <div class="form-group">
                    <input type="email" class="form-control" id="userid" placeholder="User id or Email id" name="username">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="password" placeholder="Password">
                </div>
                <br/>
                <div class="align-center">
                    <button type="submit" class="btn btn-default" id="login">Login</button>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-wrapper">
    <div class="login-container">
        <div id="login-box">
 
            <h2>Login with Username and Password</h2>
 
            <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
            </c:if>
 
            <form name="loginForm" action="<c:url value="/admin" />" method="post">
                <c:if test="${not empty error}">
                    <div class="error" style="color: #ff0000;">${error}</div>
                </c:if>
                <div class="form-group">
                    <label for="username">User: </label>
                    <input type="text" id="username" name="username" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" class="form-control" />
                </div>
 
                <input type="submit" value="Submit" class="btn btn-default">
 				<c:if test="${pageContext.request.userPrincipal.name  == 'admin'}">
                                <li><a href="<c:url value="/admin" />">Admin</a></li>
                            </c:if>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            </form>
 
        </div>
    </div>
</div>
</html> 


 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Latest compiled and minified CSS -->

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">




<!-- jQuery library -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>




<!-- Latest compiled JavaScript -->

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Insert title here</title>

</head>

<body>




<h2>Login Form</h2> 




<div class="container" style="padding:50px 0">

	<div class="row">login</div>

	<!-- Main Form -->

	<div class="l">

	<c:url var="loginUrl" value="/j_spring_security_check" />

	

		<form id="login-form" name="formLogin" action="${loginUrl}"  method="post" class="text-left">

			<div class="login-form-main-message"></div>

			<div class="main-login-form">

				<div class="login-group">

					<div class="form-group">

						<label for="lg_username" class="sr-only">Username</label>

						<input type="text" class="form-control" id="lg_username" name="j_username" placeholder="username">

					</div>

					<div class="form-group">

						<label for="lg_password" class="sr-only">Password</label>

						<input type="password" class="form-control" id="lg_password" name="j_password" placeholder="password">

					</div>




				</div>

				<!-- <button type="submit" class="login-button">Login</button> -->

				<input type="submit" name="submit" value="Login"/>

			</div>

			 <input type="hidden" name="${_csrf.parameterName}"

			value="${_csrf.token}" />

		</form>

		</div>

		</div>







  <div class="container" style="background-color:#f1f1f1">

    <button type="button" class="cancelbtn">Cancel</button>

    <span class="psw">New User <a href="#">Register</a></span>

  </div>

</form>

    

</body>

</html>  --%>