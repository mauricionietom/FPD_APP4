/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Experiencia;
import Modelo.Usuario;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mnieto
 */
public class DaoUsuario {
    
   
      private Connection conexion;

    public DaoUsuario()throws SQLException {
        Conexion db=Conexion.getConexion();
        this.conexion=db.getConnection();
    }  
    
    
    public int autenticar(String email, String pswd) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        String query;
        Usuario u=null;
        int rta=0;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Statement stmt = (Statement) conexion.createStatement();
        query = "SELECT * FROM Usuario;";
        stmt.executeQuery(query);
        ResultSet rs = stmt.getResultSet();
        
        System.out.println(query);
        
        while (rs.next()) {
           
            if ((email.equals(rs.getString("email")))&&(pswd.equals(rs.getString("pswd")))) {
            rta= 1; 
           }else{
                rta=2;
            }
                
           }
          return rta;
    }
    
     public boolean RegistroUser (Usuario esq) throws SQLException{
        boolean resultado=false;
    
        try{
        //!.Establecer la consulta
        String consulta="INSERT INTO USUARIO VALUES(?,?,?,?,?,?)";
        //2.Crear el prepareStament
          PreparedStatement statement;
          statement=this.conexion.prepareStatement(consulta);
        
        //-------------------------------------------------
        
        statement.setInt(1, esq.getIdUser());
        statement.setString(2, esq.getEmail());
        statement.setString(3, esq.getPswd());
        statement.setString(4, esq.getNombreUser());
        statement.setString(5, esq.getApellido());
        statement.setString(6, esq.getColegio());              
     
          //-----------------------------------------------

          
        //3.Hacer la ejecucion
        resultado=statement.execute();
        
    }catch(SQLException ex){
        ex.printStackTrace();
    }
        return resultado;
}
     
     public boolean ValidacionPswd (String pswd, String pswd2) throws SQLException{
        boolean resultado;
        
      if(pswd.equals(pswd2)){
         resultado= true;
      }else 
          resultado=false;
         
          return resultado;
}
     
      public Usuario objetoUsario(int idUser) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        
        String query;
        Usuario esq=null;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Statement stmt = (Statement) conexion.createStatement();
        query = "SELECT * FROM Usuario WHERE idUser=" + idUser+ ";";
        stmt.executeQuery(query);
        ResultSet rs = stmt.getResultSet();
        
        System.out.println(query);
        
        while (rs.next()) {
            
            esq= new Usuario();
            esq.setIdUser(rs.getInt("IdUser"));
            esq.setEmail(rs.getString("Email"));
            esq.setPswd(rs.getString("Pswd"));
            esq.setNombreUser(rs.getString("Nombre"));
            esq.setApellido(rs.getString("Apellido"));
            esq.setColegio(rs.getString("Colegio"));
            
           }
        return esq;
    }
     
}
