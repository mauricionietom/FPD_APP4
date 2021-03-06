/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Album;
import Modelo.Experiencia;
import Modelo.InterpreteAlbum;
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
public class DaoInterpreteAlbum {
    
    
    private Connection conexion;

    public DaoInterpreteAlbum() throws SQLException {
        Conexion db = Conexion.getConexion();
        this.conexion = db.getConnection();
    }
    
    public boolean insertar(InterpreteAlbum esq) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        boolean resultado = false;

        try {
            //!.Establecer la consulta
            String consulta = "INSERT INTO INTERPRETEALBUM (id Interprete,idAlbum) VALUES (?,?)";
            //2.Crear el prepareStament
            PreparedStatement statement;
            statement = this.conexion.prepareStatement(consulta);

            

            //-------------------------------------------------
            statement.setInt(1, esq.getIdInterprete());
            statement.setInt(2, esq.getIdAlbum());
            
                      //-----------------------------------------------

            //3.Hacer la ejecucion
            resultado = statement.execute();
            resultado = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }
    
    
    
        public Album objetoAlbum(String nombre) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        String query;
        Album esq = null;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Statement stmt = (Statement) conexion.createStatement();
        query = "SELECT * FROM ALBUM WHERE Titulo=" + nombre + ";";
        stmt.executeQuery(query);
        ResultSet rs = stmt.getResultSet();

        System.out.println(query);

        DaoUsuario d = new DaoUsuario();

        while (rs.next()) {
            esq = new Album();
            
            esq.setIdAlbum(rs.getInt("idAlbum"));
            esq.setNombreAlbum(rs.getString("NombreAlbum"));
           
        }

        return esq;
    }
    }
    
   
    
    
    

