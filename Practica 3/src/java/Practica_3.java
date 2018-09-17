/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LSTI204_A7
 */
@WebServlet(urlPatterns = {"/Practica_3"})
public class Practica_3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<style type=\"text/css\">\n" +
                        "  	#null {\n" +
                        "		position:relative;\n" +
                        "		width:940px;\n" +
                        "		height:380px;\n" +
                        "               left: 320px;\n" +
                        "		background-color: green;\n" +
                        "		font-size:20px;\n" +
                        "		text-align: center;\n" +
                        "		font-family: \"Times New Roman\";\n" +
                        "\n" +
                        "		}\n" +
                        "</style>");
            out.println("<title>Servlet Practica_3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div id=null>");
            out.println("<form action=\"Practica_3\" method=\"Post\">\n" +
                        "  <fieldset>\n" +
                        "    <legend>Informacion Personal:</legend>\n" +
                        "    Nombre:<br>\n" +
                        "    <input size=\"50\" type=\"text\" name=\"name\">\n" +
                        "    <br>\n" +
                        "    Primer Apellido:<br>\n" +
                        "    <input size=\"50\" type=\"text\" name=\"lastname1\">\n" +
                        "    <br>\n" +
                        "    Segundo Apellido:<br>\n" +
                        "    <input size=\"50\" type=\"text\" name=\"lastname2\">\n" +
                        "    <br>\n" +
                        "    Fecha de Nacimiento:<br>\n" +
                        "    <input size=\"50\" type=\"date\" name=\"brtdy\">\n" +
                        "    <br>\n" +
                        "    Correo:<br>\n" +
                        "    <input size=\"50\" type=\"email\" name=\"mail\">\n" +
                        "    <br>\n" +
                        "    Contraseña:<br>\n" +
                        "    <input size=\"50\" type=\"password\" name=\"pass\">\n" +
                        "    <br>\n" +
                        "    <br>\n" +
                        "    <input type=\"submit\" value=\"Registrar\">\n" +
                        "  </fieldset>\n" +
                        "</form></div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                PrintWriter out = response.getWriter();
                String name = request.getParameter("name");
                String ap1 = request.getParameter("lastname1");
                String ap2 = request.getParameter("lastname2");
                String cumple = request.getParameter("brtdy");
                String correo = request.getParameter("mail");
                String pass = request.getParameter("pass");

                out.println("<html>");
                out.println("<head><title>Copia</title></head>");
                out.println("<body>");
                out.println("<fieldset><h2>Copia de Registro</h2>");
                out.println("Su nombre completo: <strong>" + name + ap1 + ap2 + "</strong><br>");
                out.println("Su fecha de nacimiento: <strong>" + cumple + "</strong><br>");
                out.println("Su correo: <strong>" + correo + "</strong><br>");
                out.println("Su contraseña: <strong>" + pass + "</strong><br>");
                out.println("</body></html>");
    }
    


	private void response(HttpServletResponse resp)
			throws IOException {
            
	}
}
