
package com.emergentes;
import java.security.SecureRandom;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "E6", urlPatterns = {"/E6"})
public class E6 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>E6</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>BIENVENIDO AL JUEGO DE DADOS</h1>");
            int sum=0;
            sum=suma();
            if(sum ==7 || sum==11){
                out.print("<p><b>La suma es: " +sum+ " Ustede ganó el juego</b> </p>");
            }else{
                out.print("<p><b>La suma es: " +sum+ " Ustede perdió el juego</b> </p>");
            }
            
            out.println("<br>");
            out.println("<a href='Main'>VOLVER AL MENÚ</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

private int suma(){
    SecureRandom numAl=new SecureRandom();
    int da1=numAl.nextInt(7);
    int da2=numAl.nextInt(11);
    return(da1+da2);
}
}
