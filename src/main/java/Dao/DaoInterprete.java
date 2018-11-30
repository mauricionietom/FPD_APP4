/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Experiencia;
import Modelo.Interprete;
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
public class DaoInterprete {
    
    private Connection conexion;
    
      public DaoInterprete() throws SQLException {
        Conexion db = Conexion.getConexion();
        this.conexion = db.getConnection();
    }
    
      
  public boolean insertar(Interprete esq) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        boolean resultado = false;

        try {
            //!.Establecer la consulta
            String consulta = "INSERT INTO INTERPRETE (id,nombre) VALUES (?,?)";
            //2.Crear el prepareStament
            PreparedStatement statement;
            statement = this.conexion.prepareStatement(consulta);

            //-------------------------------------------------
            statement.setString(1, esq.getNombreArtista());
            //-----------------------------------------------

            //3.Hacer la ejecucion
            resultado = statement.execute();
            resultado = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }
      
   public Interprete objetoInterprete(String nombre) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        String query;
        Interprete esq = null;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Statement stmt = (Statement) conexion.createStatement();
        query = "SELECT * FROM Interprete WHERE nombre=" + nombre + ";";
        stmt.executeQuery(query);
        ResultSet rs = stmt.getResultSet();

        System.out.println(query);

        DaoUsuario d = new DaoUsuario();

        while (rs.next()) {
            esq = new Interprete();
            
            esq.setIdInterprete(rs.getInt("IdInterprete"));
            esq.setNombreArtista(rs.getString("nombreArtista"));


        }

        return esq;
    }
}
