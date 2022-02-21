import java.io.*;
import javax.servlet.*;
import java.util.*;
import javax.servlet.http.*;

public class skhst_servlet extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname") ;
        String rno = request.getParameter("rno");
        out.println("<h1>Welcome " + uname + "!</h1><br>");
        out.println("<p>Kindly check your roll no : </p>" + rno);  
        Date today = new Date();
        out.println("<h2>Today is " + today + "<h2>"); 
        
        
        // Cookies
    
//        Cookie ck_uname = new Cookie("uname",uname);
//        Cookie ck_rno = new Cookie("rno",rno);
//        response.addCookie(ck_uname);
//        response.addCookie(ck_rno);        

        // Hidden Forms

//        out.println("<form action='gnpsd_servlet'>"
//                + "<input type='hidden' name = 'uname' value=" + uname + ">"
//                + "<input type = 'hidden' name = 'rno' value=" + rno + ">"
//                + "<input value='Cookiefy' type ='submit'></form>");


        //URL re-writing
         out.println("<a href = 'gnpsd_servlet?uname='>"+uname+"'&rno='"+rno+"' rewriteURL</a>");

    }
}
        
