
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "E4", urlPatterns = {"/E4"})
public class E4 extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>E4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CAMBIO DE MONEDA DE BOLIVIANO A DOLAR Y VICEVERSA</h1>");
            out.println("<form action='Salida4' method='post'>");
            out.println("<label>Introduzca Monto: </label>");
            out.println("<input type='number' name='numero'>");           
            out.println("<br>");
            out.println("<label>Seleccione tipo de cambio: ");
            out.println("<select name='moneda' id='pa'>");
    	    out.println("<option value='Boliviano_a_Dolar'>Boliviano a Dolar</option>");
    	    out.println("<option value='Dolar_a_Boliviano'>Dolar a Boliviano</option>");
    	    out.println("</select>");
            out.println("<br>");
            out.println("<input type='submit' value='CAMBIAR'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='Main'>VOLVER AL MENÚ</a>");
            out.println("</body>");
            out.println("</html>");
    }

    }
}
