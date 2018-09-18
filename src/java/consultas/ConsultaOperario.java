/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import conexion.ConexionDB;
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
public class ConsultaOperario {
    
    private final Connection connection;
    private final List<Operario> listc = new ArrayList<Operario>();
   
    public List<Operario> mostrarOperarios(){
        try { 
          Statement statement =  null; 
          statement = connection.createStatement();
          ResultSet resultSet = statement.executeQuery("select * from operario where estado="+"'DISPONIBLE'"+";");  
            while (resultSet.next()){
               Operario operario= new Operario();
               
               operario.setNombre(resultSet.getString(1));
               operario.setIdentificacion(resultSet.getString(2));
               operario.setEstado(resultSet.getString(3));
               operario.setCantidad(resultSet.getString(4));
               listc.add(operario);
                
            }
         }catch (SQLException e) { 
             System.out.println("Error crear la sentencia 15256" 
                  + e.getMessage()); 
            } 
      return listc;             
    }

    public ConsultaOperario() {
        ConexionDB c1=new ConexionDB();
        connection = c1.initialize();
    }
    
    
}
