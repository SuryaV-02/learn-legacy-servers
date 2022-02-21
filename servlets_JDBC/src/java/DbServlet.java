/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SURYA
 */
public class DbServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
                PreparedStatement smt = conn.prepareStatement("INSERT INTO studentmark (RollNo,Name,Mark1,Mark2,Mark3,Total) VALUES(?,?,?,?,?,?)");
                
                String Name = request.getParameter("uname");
                Integer rno = Integer.parseInt(request.getParameter("RollNo"));
                Integer Mark1 = Integer.parseInt(request.getParameter("mark1"));
                Integer Mark2 = Integer.parseInt(request.getParameter("mark2"));
                Integer Mark3 = Integer.parseInt(request.getParameter("mark3"));
                Integer total = Mark1 + Mark2 + Mark3 ;
                
                smt.setInt(1,Integer.parseInt(request.getParameter("RollNo")));
                smt.setString(2, request.getParameter("uname"));
                smt.setInt(3,Integer.parseInt(request.getParameter("mark1")));
                smt.setInt(4,Integer.parseInt(request.getParameter("mark2")));
                smt.setInt(5,Integer.parseInt(request.getParameter("mark3")));
                smt.setInt(6,total);
                
                int r = smt.executeUpdate();
               
                out.println("<h2>Data Insertion Success!</h2>");
                
                PreparedStatement smt_retr = conn.prepareStatement("SELECT * FROM studentmark");
                
                ResultSet rs = smt_retr.executeQuery();
                
                while(rs.next()){
                    out.println("<p>Name : " + rs.getString(4) + "</p>");
                    out.println("<p>Roll no : " + rs.getInt(5) + "</p>");
                    out.println("<p>Mark 1 : " + rs.getInt(1) + "</p>");
                    out.println("<p>Mark 2 : " + rs.getInt(2) + "</p>");
                    out.println("<p>Mark 3 : " + rs.getInt(3) + "</p>");
                    out.println("<p>Total : " + rs.getInt(6) + "</p>");
                    out.println("<hr>");
                }
            }catch(Exception e){
                out.println(e);
            }
        }
    }

}
