/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Album;
import Modelo.Experiencia;
import Modelo.Sencillo;
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
public class DaoSencillo {

    private Connection conexion;

    public DaoSencillo() throws SQLException {
        Conexion db = Conexion.getConexion();
        this.conexion = db.getConnection();
    }

    public boolean insertar(Sencillo esq) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        boolean resultado = false;

        try {
            //!.Establecer la consulta
            String consulta = "INSERT INTO SENCILLO (titulo,casilla) VALUES (?,?)";
            //2.Crear el prepareStament
            PreparedStatement statement;
            statement = this.conexion.prepareStatement(consulta);

            //-------------------------------------------------
            statement.setString(1, esq.getTitulo());
            statement.setInt(2, esq.getCasilla());
            //-----------------------------------------------
            //3.Hacer la ejecucion
            resultado = statement.execute();
            resultado = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }
    
     public Sencillo objetoSenciilo(String nombre) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        String query;
        Sencillo esq = null;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Statement stmt = (Statement) conexion.createStatement();
        query = "SELECT * FROM SENCILLO WHERE titulo=" + nombre + ";";
        stmt.executeQuery(query);
        ResultSet rs = stmt.getResultSet();

        System.out.println(query);

        DaoUsuario d = new DaoUsuario();

        while (rs.next()) {
            esq = new Sencillo();
            
            esq.setIdSencillo(rs.getInt("idSencillo"));
            esq.setTitulo(rs.getString("nombre"));
            esq.setCasilla(rs.getInt("casilla"));
            
        }

        return esq;
    }

}
