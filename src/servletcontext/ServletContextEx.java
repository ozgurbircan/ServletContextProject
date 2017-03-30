package servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by LENOVO on 15.03.2017.
 */
public class ServletContextEx extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext=getServletContext();
        PrintWriter printWriter=resp.getWriter();
        String studentName=servletContext.getInitParameter("studentName");//context parametremiz
        String studentAge=servletContext.getInitParameter("studentAge");//context parametremiz.
        printWriter.print("<html><body>");
        printWriter.print("Student Name: "+studentName+"<br>");
        printWriter.print("Student Age: "+studentAge+"<br>");

        servletContext.setAttribute("setsurname","birican");//yeni parametre değerimiz

        String setsurname= (String) servletContext.getAttribute("setsurname");

        printWriter.print("servletContext.getMajorVersion() "+servletContext.getMajorVersion()+"<br>");
        printWriter.print("servletContext.getServerInfo() "+servletContext.getServerInfo()+"<br>");
        printWriter.print("servletContext.getRealPath "+servletContext.getRealPath("")+"<br>");
        printWriter.print("servletContext.getServletContextName() "+servletContext.getServletContextName()+"<br>");
        printWriter.print("servletContext.getServerInfo() "+servletContext.getServerInfo()+"<br>");
        printWriter.print(setsurname+"<br>");

        servletContext.setAttribute("number","21"+"<br>");
        printWriter.print("servletContext.getAttribute(number) "+servletContext.getAttribute("number")+"<br>");
        servletContext.removeAttribute("number");//parametremizi siliyoruz.
        printWriter.print("servletContext.getAttribute(number) "+servletContext.getAttribute("number")+"<br>");
        //parametre olmayınca null değeri dönecektir.

    }
}
