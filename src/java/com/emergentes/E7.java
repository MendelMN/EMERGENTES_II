
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "E7", urlPatterns = {"/E7"})
public class E7 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet E7</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>GENERANDO MATRIZ CARACOL</h1>");
            out.println("<form action='Salida5' method='post'>");
            out.println("<label>Introduzca Número: </label>");
            out.println("<input type='number' name='numero'>"); 
            out.println("<br>");
            out.println("<input type='submit' value='PROCESAR'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<a href='Main'>VOLVER AL MENÚ</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
