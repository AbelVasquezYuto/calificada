<%-- 
    Document   : operarios
    Created on : 18/09/2018, 02:52:46 PM
    Author     : LaboratorioFISI
--%>


<%@page import="entidades.Operario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
            
            <h3 align="center">CRA</h3>
            
          
                <table align="center "border="1">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Identificacion</th>
                            <th>Estado</th>
                        </tr>
                    </thead>
                    <form action="http://localhost:8080/practicaCalificada/Servlet" method="post">
                    
                   <% 
            List<Operario> list = null;//new ArrayList<Country>(); 
            list =(List<Operario>) request.getAttribute("Servlet");
            for(Operario c:list){%>
            <tr> 
             <td><% out.println(c.getNombre()); %></td>
              <td><% out.println(c.getIdentificacion()); %></td>
             <td><% out.println(c.getEstado()); %></td>
             <td><button type=submit name=par value=<% out.print(c.getIdentificacion());%>>ASIGNAR</button></td>
             
            </tr>   
          <% }
        %>
        
                    </form>
                </table> 
      
    </body>
</html>
