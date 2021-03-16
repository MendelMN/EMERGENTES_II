
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Salida5", urlPatterns = {"/Salida5"})
public class Salida5 extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num1 = request.getParameter("numero1");
        int n1=Integer.parseInt(num1);
        String num2 = request.getParameter("numero2");
        int n2=Integer.parseInt(num2);
        
        String op=request.getParameter("operacion");
        
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Salida5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>RESULTADO DE LA OPERACIÓN</h1>");
            String suma="suma";
            String resta="resta";
            String producto="producto";
            String division="division";
            if(op.equals(suma)){
                double sum=n1+n2;
                out.println("<p>El resultado de la suma es: "+sum+"</p>");
            }else{
                if(op.equals(resta)){
                    double res;
                    res=(double)n1-n2;
                    out.println("<p>El resultado de la resta es: "+res+"</p>");
                }else{
                    if(op.equals(producto)){
                        double pro;
                        pro=(double)n1*n2;
                        out.println("<p>El resultado del Producto es: "+pro+"</p>");
                    }else{
                       if(op.equals(division)){
                           double div;
                           div=(double)n1/n2;
                           out.println("<p>El resultado de la División es: "+div+"</p>"); 
                       }
   
                }
            }
            }
 
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='E5'>Volver</a>");
            out.println("<br>");
            out.println("<a href='Main'>VOLVER AL MENÚ</a>");
            out.println("</body>");
            out.println("</html>");
        }
        }
    }
    


