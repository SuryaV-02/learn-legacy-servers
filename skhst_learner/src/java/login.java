import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class login extends HttpServlet
{
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String name =request.getParameter("name");
String roll=request.getParameter("roll");
out.println("Thanks Mr/Ms "+name+"<br>");
out.println("Please check you details</h1><br>");
out.println("Name:"+name+"<br>");
out.println("Roll no:"+roll+"<br>");
}}
