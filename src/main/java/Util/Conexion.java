/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Labing
 */
public class Conexion {
 private static Conexion conexion=null;
 //Gestiona la conexion con la base de Datos
 private Connection connection=null;
 
// jdbc:postgresql://Host/Database?user=User&password=Password&ssl=
//true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
//DriverManager.getConnection(dbUrl);
 
 private Conexion() throws SQLException{
     
     try{
         //1.Cargar el driver
         Class.forName("com.mysql.jdbc.Driver"); 
         
     }catch(ClassNotFoundException e){
         
         
     }
     try{
         //2.Obtener la conexion                                               //nombre base de datos
        this.connection= DriverManager.getConnection("jdbc:postgresql://ec2-54-235-150-134.compute-1.amazonaws.com/dato0e1iak3v28?user=uoqgtpjxabkogv&password=c203fb69091c05c598825d38e38444be5cfa7748a00fa522a55c7b290c668b3e&ssl=\n" +
"true&sslfactory=org.postgresql.ssl.NonValidatingFactory");         
     }catch(SQLException e){
         
         
     }
  
 }
 
 public static Conexion getConexion() throws SQLException{
     if (conexion==null) {
         conexion= new Conexion();
         
     }
     return conexion;
 }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
 
}
