import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class hitcounter extends HttpServlet{
    
    private int hitCount;
    public void init(){
        hitCount = 1;
    }
    
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        
        res.setContentType("text/html");
        hitCount++;
        try{
            PrintWriter out = res.getWriter();
            out.println("<h1>" + hitCount + "</h1>");
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }     
    }
    
}