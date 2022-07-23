<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="useraccount.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>
 
	<c:forEach var="user" items="${userDetails}">
	
	<c:set var="iduser" value="${user.iduser}"/> 
	<c:set var="name" value="${user.name}"/> 
	<c:set var="email" value="${user.email}"/> 
	<c:set var="phone" value="${user.phone}"/> 
	<c:set var="username" value="${user.username}"/> 
	<c:set var="password" value="${user.password}"/> 

<!--  	
	<tr>
			<td>User ID</td>
			<td>${user.iduser}</td>
		</tr>
		<tr>
			<td>User Name</td>
			<td>${user.name}</td>
		</tr>
		<tr>
			<td>User Email</td>
			<td>${user.email}</td>
		</tr>
		<tr>
			<td>User Phone</td>
			<td>${user.phone}</td>
		</tr>
		<tr>
			<td>User UserName</td>
			<td>${user.username}</td>
		</tr>
		<tr>
			<td>User Password</td>
			<td>${user.password}</td>
		</tr>
    
    
  -->  

	 
 

<!-- html part -->
<div class="wrapper">
    <div class="left">
        <img src="https://i.imgur.com/cMy8V5j.png" 
        alt="user" width="100">
        <h4>${user.name}</h4>
         <p>User</p>
    </div>
	
    <div class="right">
        <div class="info">
            <h3>Information</h3>
            <div class="info_data">
			
                 <div class="data">
                    <h4>UserId</h4>
                    <p>${user.iduser}</p>
                 </div>
				 
                 <div class="data">
                   <h4>Full Name</h4>
                    <p>${user.name}</p>
                </div>
				  
				 
            </div>
			
			<div class="info_data">
			
                 <div class="data">
                    <h4>User Email</h4>
                    <p>${user.email}</p>
                 </div>
				 
                 <div class="data">
                   <h4>User Phone</h4>
                    <p>${user.phone}</p>
                </div>
				  
				 
            </div>
        </div>
		
      
      <div class="projects">
            <h3>Account Information</h3>
			
            <div class="projects_data">
                 <div class="data">
                    <h4>UserName</h4>
                    <p>${user.username}</p>
                 </div>
				 
                 <div class="data">
                   <h4>Password</h4>
                    <p>${user.password}</p>
              </div>
            </div>
        </div>
        
        </c:forEach>
      
        


<!-- html part end -->

<c:url value="updateuser.jsp" var="userupdate">
<c:param name="iduser" value="${iduser}"/>
<c:param name="name" value="${name}"/>
<c:param name="email" value="${email}"/>
<c:param name="phone" value="${phone}"/>
<c:param name="username" value="${username}"/>
<c:param name="password" value="${password}"/>
</c:url>

<a href="${userupdate}">
<input type="button" name="update" value="   Update  " class="btn">
</a>

 

<c:url value="deleteuser.jsp" var="userdelete">
<c:param name="iduser" value="${iduser}"/>
<c:param name="name" value="${name}"/>
<c:param name="email" value="${email}"/>
<c:param name="phone" value="${phone}"/>
<c:param name="username" value="${username}"/>
<c:param name="password" value="${password}"/>
</c:url>
<a href="${userdelete}">
<input type="button" name ="delete" value="   Delete  " class="btn">
</a>

 

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
















