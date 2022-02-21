import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class gnpsd_servlet extends HttpServlet{
    
    protected void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        Cookie ck[] = req.getCookies();
        
//        out.println("Name : " + ck[0].getValue());
//        out.println("Rno : " + ck[1].getValue());

//        out.println("Hidden Name : "+ req.getParameter("uname"));
//        out.println("Hidden rno : " + req.getParameter("rno"));
        
        out.println("URL name : "+ req.getParameter("uname"));
        out.println("URL rno : " + req.getParameter("rno"));
        
        out.close();    
        
             
    }
    
}