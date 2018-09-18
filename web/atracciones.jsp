<%-- 
    Document   : index
    Created on : 18/09/2018, 03:29:55 PM
    Author     : LaboratorioFISI
--%>
<%@page import="entidades.Atracciones"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
                            <th>Direccion</th>
                            <th>Tipo</th>
                            <th>Numero</th>
                            <th>Estado</th>
                        </tr>
                    </thead>
                    <form action="http://localhost:8080/practicaCalificada/Servlet" method="post">
                    
                   <% 
            List<Atracciones> list = null;//new ArrayList<Country>(); 
            list =(List<Atracciones>) request.getAttribute("Servlet1");
            for(Atracciones c:list){%>
            <tr>
             <td><% out.println(c.getNombre()); %></td>
             <td><% out.println(c.getDireccion()); %></td>
             <td><% out.println(c.getTipo()); %></td>
             <td><% out.println(c.getNumero()); %></td>
             <td><% out.println(c.getEstado()); %></td>
             
             <td><button type="submit" value="">Asignar Operario</button></td>
            </tr>   
          <% }
        %>
        
                    </form>
                </table> 
    </body>
</html>
