
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "E2", urlPatterns = {"/E2"})
public class E2 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>E2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Leer Número Para calcular Factorial</h1>");
             out.println("<form action='Salida2' method='post'>");
            out.println("<label>Número: </label>");
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
