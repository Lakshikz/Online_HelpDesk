<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
  <head>
    <title> Website Page</title>
	<link rel="stylesheet" href="register.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
	
  </head>
  <body>
   
    <div  class="hero">
	 <div class="navbar">
	    <img src="images/logo.png" class="logo" alt="">
		<button type="button" class="bb">Sign Up</button>
		</div>
		
		 <div class="content">
		    <small>Welcome to our</small>
			<h1>IT Support <br> HelpDesk</h1>
			<h5>Build, organize, and collaborate <br>on work in one place <br>from virtually anywhere</h5><br>
			<button type="button" class="bb">Take a tour</button>
		 </div>
		 <div class="side-bar">
		    <img src="images/menu.png" class="menu" alt="">
			
			
			 <div class="social-links">
			    <img src="images/fb.png" alt="">
				<img src="images/ig.png" alt="">
				<img src="images/tw.png" alt="">
			 </div>
			 
			 <div class="useful-links">
			    <img src="images/share.png" alt="">
				<img src="images/info.png" alt="">
				 
			 </div>
			 
		 </div>
		
		<!----Register----->
    <div class="global-container">
	   <div class="card login-form">
	    <div class="card-body">
		 <h1 class="card-title text-center">Register</h1>
		  <div class="card-text">
		    <form action="insert" method="post"onsubmit="return checkPassword()">
			
			  <div class="form-group">
			  <label for="exampleInputName">Name</label>
			  <input type="text" 
			  class="form-control form-control-sm" 
			  id="exampleInputName"
			  name="name" placeholder="Full Name" required>
			  </div>
			  
			  <div class="form-group">
			  <label for="exampleInputEmail">Email</label>
			  <input type="email" 
			  class="form-control form-control-sm" 
			  id="exampleInputEmail"
			  name="email" 
			  pattern="[a-zA-Z0-9._%+-]+@[a-z0-9]+\.[a-z]{2,3}"
			  placeholder="Email" required>
			  </div>
			  
			  <div class="form-group">
			  <label for="exampleInputPhone">Phone</label>
			  <input type="text" 
			  class="form-control form-control-sm" 
			  pattern="[0-9]{10}" 
			  id="exampleInputPhone"
			  name="phone"
			  placeholder="Phone Number"required>
			  </div>
			  
			  <div class="form-group">
			  <label for="exampleInputUserName">User Name</label>
			  <input type="text" 
			  class="form-control form-control-sm" 
			  id="exampleInputUserName"
			  name="uid"
			  placeholder="User Name"required>
			  </div>
			  
			  <div class="form-group">
			  <label for="exampleInputPassword1">Password</label>
			  <input type="password" 
			  class="form-control form-control-sm" 
			  id="exampleInputPassword1"
			  name="psw"
			  pattern="[A-Za-z0-9]{5,8}" 
			  placeholder="Password" required>
			  </div>
			  
			  <div class="form-group">
			  <label for="exampleInputPassword1">ReEnter-Password</label>
			  <input type="password" 
			  class="form-control form-control-sm"
			  id="rpwd" 
			  name="rpwd"    
			  pattern="[A-Za-z0-9]{5,8}" 
			  placeholder="Confirm Password"required> 
			  </div>
			  
	          Accept privacy policy terms
	          <input type="checkbox" 
			  id="policy" 
			  name="policy" 
			  required onclick="enableButton()"> 
	 
			  
			  <button type="submit" class="btn btn-primary btn-block" id="btn1" name="submit" value="Create Customer" disabled class="submit-btn">
			    Submit
			  </button><br>
			  <div class="sigup">
			  Do you have an account? <a href="login.jsp">Sign in here</a>
			  </div>
			   
			</form>
		  </div>
		</div>
	   </div>
	</div>


<script>
function checkPassword(){
	if(document.getElementById("exampleInputPassword1").value != document.getElementById("rpwd").value){
		alert("Password are mismatched!!");
		return false;
	}
	else{
		alert("Passwords matched!!");
		return true;
	}
}
function enableButton(){
	if(document.getElementById("policy").checked){
		document.getElementById("btn1").disabled=false;
	}
	else{
		document.getElementById("btn1").disabled=true;
	}
}

</script>

<!----Register End----->
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