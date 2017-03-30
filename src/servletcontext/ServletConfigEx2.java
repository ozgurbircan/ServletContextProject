package servletcontext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by LENOVO on 30.03.2017.
 */
public class ServletConfigEx2 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        ServletConfig servletConfig=getServletConfig();
        PrintWriter printWriter=response.getWriter();
        String ad=servletConfig.getInitParameter("ad");
        String soyad=servletConfig.getInitParameter("soyad");
        String ders=servletConfig.getServletContext().getInitParameter("ders");


        printWriter.print("<html><body>");
        printWriter.print("ServletConfigEx2"+"<br>");
        printWriter.print("Config parametremiz Ad : "+ad+"<br>");//Config parametremiz.
        printWriter.print("Config parametremiz Soyad : "+soyad+"<br>");//Config parametremiz.
        printWriter.print("Context parametremiz Ders : "+ders+"<br>"); //Context parametremiz.


    }
}
