
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Salida1", urlPatterns = {"/Salida1"})
public class Salida1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre=request.getParameter("nombre");
        
        String var = request.getParameter("nac");
        int añon=Integer.parseInt(var);
  
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Salida1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>LA EDAD DE LA PERSONA</h1>");
            out.println("<p>Nombre: "+ nombre +"</p>");
            añon=2021-añon;
            out.println("<p>Edad: "+añon+"</p>");
            out.println("<a href='E1'>Volver</a>");
            out.println("<br>");
            out.println("<a href='Main'>VOLVER AL MENÚ</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }}
