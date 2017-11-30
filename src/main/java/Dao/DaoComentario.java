/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Comentario;
import Modelo.Experiencia;
import Modelo.Usuario;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author mnieto
 */
public class DaoComentario {

    private Connection conexion;

    public DaoComentario() throws SQLException {
        Conexion db = Conexion.getConexion();
        this.conexion = db.getConnection();
    }

    public boolean insertar(Comentario esq) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        boolean resultado = false;

        try {
            //!.Establecer la consulta
            String consulta = "INSERT INTO COMENTARIO (descripcion,idExp,idUser) VALUES(?,?,?)";
            //2.Crear el prepareStament
            PreparedStatement statement;
            statement = this.conexion.prepareStatement(consulta);

            //-------------------------------------------------
           
            statement.setString(1, esq.getDescripcion());
            statement.setInt(2, esq.getIdExp());
            statement.setInt(3, esq.getIdUser());

            //----------------------------------------------- 
            //3.Hacer la ejecucion
            resultado = statement.execute();
            resultado = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    public Comentario objetoUsario(int idCom) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        String query;
        Comentario esq = null;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Statement stmt = (Statement) conexion.createStatement();
        query = "SELECT * FROM Comentario WHERE idCom=" + idCom + ";";
        stmt.executeQuery(query);
        ResultSet rs = stmt.getResultSet();

        System.out.println(query);

        DaoUsuario du = new DaoUsuario();
        DaoExperiencia de = new DaoExperiencia();

        while (rs.next()) {

        }

        esq = new Comentario();
        esq.setIdCom(rs.getInt("idCom"));
        esq.setDescripcion(rs.getString("Descripcion"));
        esq.setIdUser((rs.getInt("IdUser")));
        esq.setIdExp(rs.getInt("idExp"));
        
        return esq;
    }

    public void deleteComentario(int IdCom) {
        try {
            PreparedStatement preparedStatement = conexion
                    .prepareStatement("delete from Comentario where userid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, IdCom);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Comentario> getAllComentarios(int idExp, int idUser) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ArrayList<Comentario> Coment = new ArrayList<Comentario>();
        try {

            Statement statement = conexion.createStatement();
            DaoUsuario du = new DaoUsuario();
            DaoExperiencia de = new DaoExperiencia();
            ResultSet rs = statement.executeQuery("select * from comentario where idExp=" + idExp + "");

            while (rs.next()) {
                Comentario esq = new Comentario();

                esq = new Comentario();
                esq.setIdCom(rs.getInt("idCom"));
                esq.setDescripcion(rs.getString("Descripcion"));
                esq.setIdUser(rs.getInt("idUser"));
                esq.setIdExp(rs.getInt("idExp"));

                Coment.add(esq);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Coment;
    }

    

}
