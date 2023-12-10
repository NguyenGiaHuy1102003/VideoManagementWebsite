/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-07-21 04:53:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<footer class=\"tm-bg-gray pt-5 pb-3 tm-text-gray tm-footer\">\r\n");
      out.write("	<div class=\"container-fluid tm-container-small\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-lg-6 col-md-12 col-12 px-5 mb-5\">\r\n");
      out.write("				<h3 class=\"tm-text-primary mb-4 tm-footer-title\">About\r\n");
      out.write("					Catalog-Z</h3>\r\n");
      out.write("				<p>\r\n");
      out.write("					Catalog-Z is free <a rel=\"sponsored\"\r\n");
      out.write("						href=\"https://v5.getbootstrap.com/\">Bootstrap 5</a> Alpha 2 HTML\r\n");
      out.write("					Template for video and photo websites. You can freely use this\r\n");
      out.write("					TemplateMo layout for a front-end integration with any kind of CMS\r\n");
      out.write("					website.\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-lg-3 col-md-6 col-sm-6 col-12 px-5 mb-5\">\r\n");
      out.write("				<h3 class=\"tm-text-primary mb-4 tm-footer-title\">Our Links</h3>\r\n");
      out.write("				<ul class=\"tm-footer-links pl-0\">\r\n");
      out.write("					<li><a href=\"#\">Advertise</a></li>\r\n");
      out.write("					<li><a href=\"#\">Support</a></li>\r\n");
      out.write("					<li><a href=\"#\">Our Company</a></li>\r\n");
      out.write("					<li><a href=\"#\">Contact</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-lg-3 col-md-6 col-sm-6 col-12 px-5 mb-5\">\r\n");
      out.write("				<ul class=\"tm-social-links d-flex justify-content-end pl-0 mb-5\">\r\n");
      out.write("					<li class=\"mb-2\"><a href=\"https://facebook.com\"><i\r\n");
      out.write("							class=\"fab fa-facebook\"></i></a></li>\r\n");
      out.write("					<li class=\"mb-2\"><a href=\"https://twitter.com\"><i\r\n");
      out.write("							class=\"fab fa-twitter\"></i></a></li>\r\n");
      out.write("					<li class=\"mb-2\"><a href=\"https://instagram.com\"><i\r\n");
      out.write("							class=\"fab fa-instagram\"></i></a></li>\r\n");
      out.write("					<li class=\"mb-2\"><a href=\"https://pinterest.com\"><i\r\n");
      out.write("							class=\"fab fa-pinterest\"></i></a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<a href=\"#\" class=\"tm-text-gray text-right d-block mb-2\">Terms\r\n");
      out.write("					of Use</a> <a href=\"#\" class=\"tm-text-gray text-right d-block\">Privacy\r\n");
      out.write("					Policy</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-lg-8 col-md-7 col-12 px-5 mb-3\">Copyright 2020\r\n");
      out.write("				Catalog-Z Company. All rights reserved.</div>\r\n");
      out.write("			<div class=\"col-lg-4 col-md-5 col-12 px-5 text-right\">\r\n");
      out.write("				Designed by <a href=\"https://templatemo.com\" class=\"tm-text-gray\"\r\n");
      out.write("					rel=\"sponsored\" target=\"_parent\">TemplateMo</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<script src=\"<c:url value='/teamplate/user/js/plugins.js'/>\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("        $(window).on(\"load\", function() {\r\n");
      out.write("            $('body').addClass('loaded');\r\n");
      out.write("        });\r\n");
      out.write("    </script>");
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