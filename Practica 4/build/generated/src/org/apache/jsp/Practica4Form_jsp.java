package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Practica4Form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style> \n");
      out.write("        body {\n");
      out.write("        background-color: red;\n");
      out.write("        font-size: 25px;     \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        formulario {\n");
      out.write("            text-color: blue;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("        <title>Practica 4: Solicitud</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\\\n");
      out.write("        <div id=\"formulario\">\n");
      out.write("        <form action=\"Practica4Respon.jsp\"> \n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Informacion Personal:</legend>\n");
      out.write("                Nombre:<br>\n");
      out.write("                <input size=\"50\" type=\"text\" name=\"name\">\n");
      out.write("                <br>\n");
      out.write("                Primer Apellido:<br>\n");
      out.write("                <input size=\"50\" type=\"text\" name=\"lastname1\">\n");
      out.write("                <br>\n");
      out.write("                Segundo Apellido:<br>\n");
      out.write("                <input size=\"50\" type=\"text\" name=\"lastname2\">\n");
      out.write("                <br>\n");
      out.write("                Fecha de Nacimiento:<br>\n");
      out.write("                <input size=\"50\" type=\"date\" name=\"brtdy\">\n");
      out.write("                <br>\n");
      out.write("                Correo:<br>\n");
      out.write("                <input size=\"50\" type=\"email\" name=\"mail\">\n");
      out.write("                <br>\n");
      out.write("                Contraseña:<br>\n");
      out.write("                <input size=\"50\" type=\"password\" name=\"pass\">\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"Registrar\" > \n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
