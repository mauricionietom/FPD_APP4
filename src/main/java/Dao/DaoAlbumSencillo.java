/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Album;
import Modelo.AlbumSencillo;
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
public class DaoAlbumSencillo {

    private Connection conexion;

    public DaoAlbumSencillo() throws SQLException {
        Conexion db = Conexion.getConexion();
        this.conexion = db.getConnection();
    }

    public boolean insertar(AlbumSencillo esq) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        boolean resultado = false;

        try {
            //!.Establecer la consulta
            String consulta = "INSERT INTO ALBUMSENCILLO (idAlbum,idSencillo) VALUES (?,?)";
            //2.Crear el prepareStament
            PreparedStatement statement;
            statement = this.conexion.prepareStatement(consulta);

            //-------------------------------------------------
            statement.setInt(1, esq.getIdAlbum());
            statement.setInt(2, esq.getIdSencillo());

            //-----------------------------------------------
            //3.Hacer la ejecucion
            resultado = statement.execute();
            resultado = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    public AlbumSencillo objetoAlbumSencillo(String nombre) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        String query;
        AlbumSencillo esq = null;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Statement stmt = (Statement) conexion.createStatement();
        query = "SELECT * FROM ALBUMSENCILLO WHERE Titulo=" + nombre + ";";
        stmt.executeQuery(query);
        ResultSet rs = stmt.getResultSet();

        System.out.println(query);

        while (rs.next()) {
            esq = new AlbumSencillo();

            esq.setIdAlbum(rs.getInt("idAlbum"));
            esq.setIdSencillo(rs.getInt("idSencillo"));

        }

        return esq;
    }

}
