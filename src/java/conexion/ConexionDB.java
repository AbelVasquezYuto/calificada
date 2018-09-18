package conexion;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionDB {
    
 private Connection _connection = null;
  PreparedStatement ps = null;
   ResultSet rs=null;
   
    PreparedStatement ps2= null;
    ResultSet rs2=null;
           
 public Connection initialize(){         
  try { 
    DriverManager.registerDriver( new Driver()); 
      _connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/divertimiento","root","");
      System.out.println("Conexion exitosa");
  }
    catch (SQLException e) { 
     System.out.println( 
      "Error" 
         + e.getMessage()); 
    }
  return _connection;
 }
    
   public void actualizar(String identificacion){
        try{
            ps = initialize().prepareStatement("update operario set estado='0' where identificacion="+identificacion+";");
            ps.executeUpdate();
            
            
            
        }catch(Exception e){
            System.out.println("ERROR "+e.getMessage());
        }
    }
   
    public void actualizar2(String nombre){
        try{
            ps2 = initialize().prepareStatement("update atraccion set estado='NO DISPONIBLE' where nombre="+nombre+";");
            ps2.executeUpdate();
            
            
            
        }catch(Exception e){
            System.out.println("ERROR "+e.getMessage());
        }
    }

}


