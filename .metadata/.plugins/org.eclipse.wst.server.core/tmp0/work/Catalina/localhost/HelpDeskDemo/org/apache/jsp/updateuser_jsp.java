/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2021-10-12 16:50:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"useraccount.css\">\r\n");
      out.write("	<script src=\"https://kit.fontawesome.com/b99e675b6e.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

   String iduser = request.getParameter("iduser");
   String name = request.getParameter("name");
   String email = request.getParameter("email");
   String phone = request.getParameter("phone");
   String username = request.getParameter("username");
   String password = request.getParameter("password");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("  <form action=\"update\" method=\"post\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("    <div class=\"left\">\r\n");
      out.write("        <img src=\"https://i.imgur.com/cMy8V5j.png\" \r\n");
      out.write("        alt=\"user\" width=\"100\">\r\n");
      out.write("        <h4>HI,</h4>\r\n");
      out.write("         <p>Welcome Back!</p>\r\n");
      out.write("    </div>\r\n");
      out.write("	\r\n");
      out.write("    <div class=\"right\">\r\n");
      out.write("        <div class=\"info\">\r\n");
      out.write("            <h3>Update Account</h3>\r\n");
      out.write("            <div class=\"info_data\">\r\n");
      out.write("			\r\n");
      out.write("                 <div class=\"data\">\r\n");
      out.write("                    <h4>Id</h4>\r\n");
      out.write("                     <input type=\"text\" name=\"iduser\" value=\"");
      out.print(iduser);
      out.write("\" readonly> \r\n");
      out.write("                 </div>\r\n");
      out.write("				 \r\n");
      out.write("                 <div class=\"data\">\r\n");
      out.write("                   <h4>Name</h4>\r\n");
      out.write("			 <input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\"> \r\n");
      out.write("                </div>\r\n");
      out.write("				  \r\n");
      out.write("				 \r\n");
      out.write("            </div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"info_data\">\r\n");
      out.write("			\r\n");
      out.write("                 <div class=\"data\">\r\n");
      out.write("                    <h4>Email</h4>\r\n");
      out.write("                    <input type=\"text\" name=\"email\" value=\"");
      out.print(email);
      out.write("\">\r\n");
      out.write("                 </div>\r\n");
      out.write("				 \r\n");
      out.write("                 <div class=\"data\">\r\n");
      out.write("                   <h4>Phone</h4>\r\n");
      out.write("                    <input type=\"text\" name=\"phone\" value=\"");
      out.print(phone);
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("				  \r\n");
      out.write("				 \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"info_data\">\r\n");
      out.write("			\r\n");
      out.write("                 <div class=\"data\">\r\n");
      out.write("                    <h4>UserName</h4>\r\n");
      out.write("                    <input type=\"text\" name=\"uname\" value=\"");
      out.print(username);
      out.write("\">\r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"data\">\r\n");
      out.write("                    <h4>Password</h4>\r\n");
      out.write("                    <input type=\"password\" name=\"pass\" value=\"");
      out.print(password);
      out.write("\">\r\n");
      out.write("                 </div>\r\n");
      out.write("				 \r\n");
      out.write("                 \r\n");
      out.write("				  \r\n");
      out.write("				 \r\n");
      out.write("            </div>\r\n");
      out.write("        <div class=\"data\">\r\n");
      out.write("        <br>\r\n");
      out.write("                    <h4></h4>\r\n");
      out.write("                    <input type=\"submit\" name=\"submit\" value=\"Update My Data\" style=\"cursor:pointer;\">\r\n");
      out.write("                     \r\n");
      out.write("                </div>\r\n");
      out.write("		\r\n");
      out.write("	</form>	 \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<!--  \r\n");
      out.write("<form action=\"update\" method=\"post\">\r\n");
      out.write("<table>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>User ID</td>\r\n");
      out.write("			<td><input type=\"text\" name=\"iduser\" value=\"");
      out.print(iduser);
      out.write("\" readonly></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>Name</td>\r\n");
      out.write("			<td><input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\"></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("		<td>Email</td>\r\n");
      out.write("		<td><input type=\"text\" name=\"email\" value=\"");
      out.print(email);
      out.write("\"></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>Phone number</td>\r\n");
      out.write("		<td><input type=\"text\" name=\"phone\" value=\"");
      out.print(phone);
      out.write("\"></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>User name</td>\r\n");
      out.write("		<td><input type=\"text\" name=\"uname\" value=\"");
      out.print(username);
      out.write("\"></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>Password</td>\r\n");
      out.write("		<td><input type=\"password\" name=\"pass\" value=\"");
      out.print(password);
      out.write("\"></td>\r\n");
      out.write("	</tr>		\r\n");
      out.write("	</table>\r\n");
      out.write("	<br>\r\n");
      out.write("	<input type=\"submit\" name=\"submit\" value=\"Update My Data\">\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("<div class=\"social_media\">\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a></li>\r\n");
      out.write("              <li><a href=\"#\"><i class=\"fab fa-twitter\"></i></a></li>\r\n");
      out.write("              <li><a href=\"#\"><i class=\"fab fa-instagram\"></i></a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
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
