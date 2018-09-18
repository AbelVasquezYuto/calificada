/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import conexion.ConexionDB;
import entidades.Atracciones;
import entidades.Operario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LaboratorioFISI
 */
public class ConsultaAtracciones {
    
     private final Connection connection;
    private final List<Atracciones> listc = new ArrayList<Atracciones>();
   
    public List<Atracciones> mostrarAtracciones(){
        try { 
          Statement statement =  null; 
          statement = connection.createStatement();
          ResultSet resultSet = statement.executeQuery("select * from atraccion");  
            while (resultSet.next()){
               Atracciones atraccion= new Atracciones();
               
               atraccion.setNombre(resultSet.getString(1));
               atraccion.setDireccion(resultSet.getString(2));
               atraccion.setTipo(resultSet.getString(3));
               atraccion.setNumero(resultSet.getString(4));
               atraccion.setEstado(resultSet.getString(5));
               listc.add(atraccion);
                
            }
         }catch (SQLException e) { 
             System.out.println("Error crear la sentencia 15256" 
                  + e.getMessage()); 
            } 
      return listc;             
    }

    public ConsultaAtracciones() {
        ConexionDB c1=new ConexionDB();
        connection = c1.initialize();
    }
    
    
}
