
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "E3", urlPatterns = {"/E3"})
public class E3 extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>E3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'>CALCULANDO EDAD</h1>");
            int edadd=calcularedad();
            out.println("<p>La Edad es: "+edadd+"</p>");
            out.println("<br>");
            out.println("<a href='Main'>VOLVER AL MENÚ</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
  
    private int calcularedad(){
        //Scanner lea=new Scanner(System.in);
       int añoNac=2000; 
       int edad;
        edad=2021-añoNac;
        return(edad);
    }
    }

