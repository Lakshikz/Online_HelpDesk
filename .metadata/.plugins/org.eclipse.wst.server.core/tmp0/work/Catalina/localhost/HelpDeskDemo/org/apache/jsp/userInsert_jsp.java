/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2021-10-03 13:33:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title> Website Page</title>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"register.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css\" >\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto\">\r\n");
      out.write("	\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("   \r\n");
      out.write("    <div  class=\"hero\">\r\n");
      out.write("	 <div class=\"navbar\">\r\n");
      out.write("	    <img src=\"images/logo.png\" class=\"logo\" alt=\"\">\r\n");
      out.write("		<button type=\"button\" class=\"bb\">Sign Up</button>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		 <div class=\"content\">\r\n");
      out.write("		    <small>Welcome to our</small>\r\n");
      out.write("			<h1>IT Support <br> HelpDesk</h1>\r\n");
      out.write("			<h5>Build, organize, and collaborate <br>on work in one place <br>from virtually anywhere</h5><br>\r\n");
      out.write("			<button type=\"button\" class=\"bb\">Take a tour</button>\r\n");
      out.write("		 </div>\r\n");
      out.write("		 <div class=\"side-bar\">\r\n");
      out.write("		    <img src=\"images/menu.png\" class=\"menu\" alt=\"\">\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			 <div class=\"social-links\">\r\n");
      out.write("			    <img src=\"images/fb.png\" alt=\"\">\r\n");
      out.write("				<img src=\"images/ig.png\" alt=\"\">\r\n");
      out.write("				<img src=\"images/tw.png\" alt=\"\">\r\n");
      out.write("			 </div>\r\n");
      out.write("			 \r\n");
      out.write("			 <div class=\"useful-links\">\r\n");
      out.write("			    <img src=\"images/share.png\" alt=\"\">\r\n");
      out.write("				<img src=\"images/info.png\" alt=\"\">\r\n");
      out.write("				 \r\n");
      out.write("			 </div>\r\n");
      out.write("			 \r\n");
      out.write("		 </div>\r\n");
      out.write("		\r\n");
      out.write("		<!----Register----->\r\n");
      out.write("    <div class=\"global-container\">\r\n");
      out.write("	   <div class=\"card login-form\">\r\n");
      out.write("	    <div class=\"card-body\">\r\n");
      out.write("		 <h1 class=\"card-title text-center\">Register</h1>\r\n");
      out.write("		  <div class=\"card-text\">\r\n");
      out.write("		    <form action=\"insert\" method=\"post\"onsubmit=\"return checkPassword()\">\r\n");
      out.write("			\r\n");
      out.write("			  <div class=\"form-group\">\r\n");
      out.write("			  <label for=\"exampleInputName\">Name</label>\r\n");
      out.write("			  <input type=\"text\" \r\n");
      out.write("			  class=\"form-control form-control-sm\" \r\n");
      out.write("			  id=\"exampleInputName\"\r\n");
      out.write("			  name=\"name\" placeholder=\"Full Name\" required>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  \r\n");
      out.write("			  <div class=\"form-group\">\r\n");
      out.write("			  <label for=\"exampleInputEmail\">Email</label>\r\n");
      out.write("			  <input type=\"email\" \r\n");
      out.write("			  class=\"form-control form-control-sm\" \r\n");
      out.write("			  id=\"exampleInputEmail\"\r\n");
      out.write("			  name=\"email\" \r\n");
      out.write("			  pattern=\"[a-zA-Z0-9._%+-]+@[a-z0-9]+\\.[a-z]{2,3}\"\r\n");
      out.write("			  placeholder=\"Email\" required>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  \r\n");
      out.write("			  <div class=\"form-group\">\r\n");
      out.write("			  <label for=\"exampleInputPhone\">Phone</label>\r\n");
      out.write("			  <input type=\"text\" \r\n");
      out.write("			  class=\"form-control form-control-sm\" \r\n");
      out.write("			  pattern=\"[0-9]{10}\" \r\n");
      out.write("			  id=\"exampleInputPhone\"\r\n");
      out.write("			  name=\"phone\"\r\n");
      out.write("			  placeholder=\"Phone Number\"required>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  \r\n");
      out.write("			  <div class=\"form-group\">\r\n");
      out.write("			  <label for=\"exampleInputUserName\">User Name</label>\r\n");
      out.write("			  <input type=\"text\" \r\n");
      out.write("			  class=\"form-control form-control-sm\" \r\n");
      out.write("			  id=\"exampleInputUserName\"\r\n");
      out.write("			  name=\"uid\"\r\n");
      out.write("			  placeholder=\"User Name\"required>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  \r\n");
      out.write("			  <div class=\"form-group\">\r\n");
      out.write("			  <label for=\"exampleInputPassword1\">Password</label>\r\n");
      out.write("			  <input type=\"password\" \r\n");
      out.write("			  class=\"form-control form-control-sm\" \r\n");
      out.write("			  id=\"exampleInputPassword1\"\r\n");
      out.write("			  name=\"psw\"\r\n");
      out.write("			  pattern=\"[A-Za-z0-9]{5,8}\" \r\n");
      out.write("			  placeholder=\"Password\" required>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  \r\n");
      out.write("			  <div class=\"form-group\">\r\n");
      out.write("			  <label for=\"exampleInputPassword1\">ReEnter-Password</label>\r\n");
      out.write("			  <input type=\"password\" \r\n");
      out.write("			  class=\"form-control form-control-sm\"\r\n");
      out.write("			  id=\"rpwd\" \r\n");
      out.write("			  name=\"rpwd\"    \r\n");
      out.write("			  pattern=\"[A-Za-z0-9]{5,8}\" \r\n");
      out.write("			  placeholder=\"Confirm Password\"required> \r\n");
      out.write("			  </div>\r\n");
      out.write("			  \r\n");
      out.write("	          Accept privacy policy terms\r\n");
      out.write("	          <input type=\"checkbox\" \r\n");
      out.write("			  id=\"policy\" \r\n");
      out.write("			  name=\"policy\" \r\n");
      out.write("			  required onclick=\"enableButton()\"> \r\n");
      out.write("	 \r\n");
      out.write("			  \r\n");
      out.write("			  <button type=\"submit\" class=\"btn btn-primary btn-block\" id=\"btn1\" name=\"submit\" value=\"Create Customer\" disabled class=\"submit-btn\">\r\n");
      out.write("			    Submit\r\n");
      out.write("			  </button><br>\r\n");
      out.write("			  <div class=\"sigup\">\r\n");
      out.write("			  Do you have an account? <a href=\"login.jsp\">Sign in here</a>\r\n");
      out.write("			  </div>\r\n");
      out.write("			   \r\n");
      out.write("			</form>\r\n");
      out.write("		  </div>\r\n");
      out.write("		</div>\r\n");
      out.write("	   </div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function checkPassword(){\r\n");
      out.write("	if(document.getElementById(\"exampleInputPassword1\").value != document.getElementById(\"rpwd\").value){\r\n");
      out.write("		alert(\"Password are mismatched!!\");\r\n");
      out.write("		return false;\r\n");
      out.write("	}\r\n");
      out.write("	else{\r\n");
      out.write("		alert(\"Passwords matched!!\");\r\n");
      out.write("		return true;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("function enableButton(){\r\n");
      out.write("	if(document.getElementById(\"policy\").checked){\r\n");
      out.write("		document.getElementById(\"btn1\").disabled=false;\r\n");
      out.write("	}\r\n");
      out.write("	else{\r\n");
      out.write("		document.getElementById(\"btn1\").disabled=true;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!----Register End----->\r\n");
      out.write("<div class=\"bubbles\">\r\n");
      out.write("		\r\n");
      out.write("		  <img src=\"images/bubble.png\" alt=\"\">\r\n");
      out.write("		  <img src=\"images/bubble.png\" alt=\"\">\r\n");
      out.write("		  <img src=\"images/bubble.png\" alt=\"\">\r\n");
      out.write("		  <img src=\"images/bubble.png\" alt=\"\">\r\n");
      out.write("		  <img src=\"images/bubble.png\" alt=\"\">\r\n");
      out.write("		  <img src=\"images/bubble.png\" alt=\"\">\r\n");
      out.write("		  <img src=\"images/bubble.png\" alt=\"\">\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("	  \r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}