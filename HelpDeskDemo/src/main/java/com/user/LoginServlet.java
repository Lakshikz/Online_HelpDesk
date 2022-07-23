package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 PrintWriter out = response.getWriter();
		 response.setContentType("text/html");
		 
		 String username = request.getParameter("uid");
		 String password = request.getParameter("pass");
		 boolean isTrue;
		 
		 isTrue = UserDBUtil.validate(username, password);
		 
		 if(isTrue == true) {
			 
			 try {
				 
			      List<User>userDetails= UserDBUtil.getUser(username, password);
			      request.setAttribute("userDetails", userDetails);
			 
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			 //redirect
			 RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			 dis.forward(request, response);
			 
		 }else {
			 out.println("<script type='text/javascript'>");
			 out.println("alert('Your username or password is incorrect');");
			 out.println("location='login.jsp'");
			 out.println("</script>");
		 }
		 
//		 try {
//			 
//		      List<User>userDetails= UserDBUtil.validate(username, password);
//		      request.setAttribute("userDetails", userDetails);
//		 
//		 }catch(Exception e) {
//			 e.printStackTrace();
//		 }
//		 //redirect
//		 RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
//		 dis.forward(request, response);
	}

}
