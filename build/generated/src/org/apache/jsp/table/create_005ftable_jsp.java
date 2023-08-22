package org.apache.jsp.table;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.ConnectionProvider;
import java.sql.*;

public final class create_005ftable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    try
    {
    Connection con=ConnectionProvider.getCon();
    Statement st=con.createStatement();
    String q1="create table user(name varchar(100),email varchar(100)primary key ,mobileNumber bigint,securityQuestion varchar(200),answer varchar(100),password varchar(100),address varchar(500),city varchar(100),state varchar(100),country varchar(100))";
    String q2="create table product(id int,name varchar(100),category varchar(200),price int, active varchar(10))";
    System.out.println(q1);
  // st.execute(q1);
    System.out.println(q2);
    st.execute(q2);
    
    System.out.println("table create");
    con.close();
}catch(Exception e)
{
System.out.println(e);
}
    
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
