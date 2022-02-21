import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class servlet_lifecycle extends GenericServlet{
    
    public void init(ServletConfig confing){
        System.out.println("Initialising...hmm..");
    }
    
    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
        PrintWriter out = res.getWriter();
        out.print("<h1>Hello there!</h1>");
    }
    
    public void destroy(){
        System.out.println("STOPPING SERVICE....BYE..");
    }
    
    
}