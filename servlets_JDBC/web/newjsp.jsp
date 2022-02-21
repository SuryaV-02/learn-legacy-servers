<%-- 
    Document   : newjsp
    Created on : Feb 21, 2022, 8:45:25 PM
    Author     : SURYA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.util.Random;"
        import="java.util.sql.*;*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
<%
    
String s = request.getParameter("jif");
    %>
    
    <h1>
        <%=
        s    
        %>
    </h1>
    