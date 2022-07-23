<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="useraccount.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>
<%
   String iduser = request.getParameter("iduser");
   String name = request.getParameter("name");
   String email = request.getParameter("email");
   String phone = request.getParameter("phone");
   String username = request.getParameter("username");
   String password = request.getParameter("password");
%>

<br>

  <form action="update" method="post">
<div class="wrapper">
    <div class="left">
        <img src="https://i.imgur.com/cMy8V5j.png" 
        alt="user" width="100">
        <h4>HI,</h4>
         <p>Welcome Back!</p>
    </div>
	
    <div class="right">
        <div class="info">
            <h3>Update Account</h3>
            <div class="info_data">
			
                 <div class="data">
                    <h4>Id</h4>
                     <input type="text" name="iduser" value="<%=iduser%>" readonly> 
                 </div>
				 
                 <div class="data">
                   <h4>Name</h4>
			 <input type="text" name="name" value="<%=name%>"> 
                </div>
				  
				 
            </div>
			
			<div class="info_data">
			
                 <div class="data">
                    <h4>Email</h4>
                    <input type="text" name="email" value="<%=email%>">
                 </div>
				 
                 <div class="data">
                   <h4>Phone</h4>
                    <input type="text" name="phone" value="<%=phone%>">
                </div>
				  
				 
            </div>
        </div>
		
		<div class="info_data">
			
                 <div class="data">
                    <h4>UserName</h4>
                    <input type="text" name="uname" value="<%=username%>">
                 </div>
                 
                 <div class="data">
                    <h4>Password</h4>
                    <input type="password" name="pass" value="<%=password%>">
                 </div>
				 
                 
				  
				 
            </div>
        <div class="data">
        <br>
                    <h4></h4>
                    <input type="submit" name="submit" value="Update My Data" style="cursor:pointer;">
                     
                </div>
		
	</form>	 
  

<!--  
<form action="update" method="post">
<table>
		<tr>
			<td>User ID</td>
			<td><input type="text" name="iduser" value="<%=iduser%>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%=name%>"></td>
		</tr>
		<tr>
		<td>Email</td>
		<td><input type="text" name="email" value="<%=email%>"></td>
	</tr>
	<tr>
		<td>Phone number</td>
		<td><input type="text" name="phone" value="<%=phone%>"></td>
	</tr>
	<tr>
		<td>User name</td>
		<td><input type="text" name="uname" value="<%=username%>"></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="pass" value="<%=password%>"></td>
	</tr>		
	</table>
	<br>
	<input type="submit" name="submit" value="Update My Data">
</form>
</body>
</html>


-->



<br><br>
<div class="social_media">
            <ul>
              <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
              <li><a href="#"><i class="fab fa-twitter"></i></a></li>
              <li><a href="#"><i class="fab fa-instagram"></i></a></li>
          </ul>
      </div>
    </div>
</div>
 
</body>
</html>