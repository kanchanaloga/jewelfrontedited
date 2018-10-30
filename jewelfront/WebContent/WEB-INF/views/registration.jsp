<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> *** shop shop shop***</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 
</head>
<body>


<div class="container">
        <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
        	<div class="panel panel-default">
        		<div class="panel-heading">
			    		<h3 class="panel-title">Shopping Dac jewellers Registration <small>It's free!</small></h3>
			 			</div>
			 			<div class="panel-body">
			    		<form role="form" action="adduser">
			    			

			    			<div class="form-group">
			    				<input type="email" name="email" id="email" class="form-control input-sm" placeholder="Email Address" required="required">
			    			</div>
			    			
			    			<div class="form-group">
			    				<input type="text" name="name" id="name" class="form-control input-sm" placeholder="Name" required="required">
			    			</div>

			    			<div class="form-group">
			    				<input type="text" name="address" id="address" class="form-control input-sm" placeholder="Address">
			    			</div>
			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="text" name="age" id="age" class="form-control input-sm" placeholder="Age">
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="tel"   pattern="^\d{10}$"name="phoneno" id="phoneno" class="form-control input-sm" placeholder="Phoneno" required="required">
			    					</div>
			    				</div>
			    			</div>
			    			
			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="password" name="password" id="password" class="form-control input-sm" placeholder="Password" required="required">
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="password" name="password_confirmation" id="password_confirmation" class="form-control input-sm" placeholder="Confirm Password" required="required">
			    					</div>
			    				</div>
			    			</div>
			    			
			    			
			    			<input type="submit" value="Register" class="btn btn-info btn-block">
			    			
			    		</form>
			    		<form  action="index.jsp">
			    			<input type="submit" value="cancel" class="btn btn-info btn-block">
			    		</form>
			    		
			    	</div>
	    		</div>
    		</div>
    	</div>
    </div>
</body>
</html>