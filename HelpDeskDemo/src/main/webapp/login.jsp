<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <html>
  <head>
    <title> Website Page</title>
	<link rel="stylesheet" href="animation.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
  </head>
  <body>
    <div  class="hero">
	 <div class="navbar">
	    <img src="images/logo.png" class="logo" alt="">
		<button type="button">Sign Up</button>
		</div>
		
		  
		 
		 <!--   Login--->
	<div class="global-container">
	   <div class="card login-form">
	    <div class="card-body">
		 <h1 class="card-title text-center">LOGIN</h1>
		  <div class="card-text">
		    <form action="log" method="post">
			  <div class="form-group">
			  <label  >User Name</label>
			  <input type="text" 
			  class="form-control form-control-sm" 
			  id="exampleInputEmail"
			  name="uid">
			  </div>
			  
			  <div class="form-group">
			  <label for="exampleInputPassword1">Password</label>
			  <a href="#" style="float : right; f-size: 12px;">
			  Forgot Password?</a>
			  <input type="password" 
			  class="form-control form-control-sm" 
			  id="exampleInputPassword1"
			  name="pass">
			  </div>
			  
			  <button type="submit" class="btn btn-primary btn-block" name="submit" value="login">
			    Sign In
			  </button><br>
			  <div class="sigup">
			  Don't have an account? <a href="userInsert.jsp">Create One</a>
			  </div>
			  
			</form>
		  </div>
		</div>
	   </div>
	</div>
	<!--   Login--->
		
		<div class="bubbles">
		
		  <img src="images/bubble.png" alt="">
		  <img src="images/bubble.png" alt="">
		  <img src="images/bubble.png" alt="">
		  <img src="images/bubble.png" alt="">
		  <img src="images/bubble.png" alt="">
		  <img src="images/bubble.png" alt="">
		  <img src="images/bubble.png" alt="">
		
		</div>
		
	  
	</div>
	
	
  </body>
</html>