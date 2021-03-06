package Dao;

import Modelo.Experiencia;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

public class Dao {

    private Connection conexion;

    public Dao() throws SQLException {
        Conexion db = Conexion.getConexion();
        this.conexion = db.getConnection();
    }

    public boolean insertar(Experiencia esq) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        boolean resultado = false;

        try {
            //!.Establecer la consulta
            String consulta = "INSERT INTO EXPERIENCIA (nombreExp,curso,asignatura,tema,descripcion,idUser,apoyo,estado) VALUES (?,?,?,?,?,?,?,?)";
            //2.Crear el prepareStament
            PreparedStatement statement;
            statement = this.conexion.prepareStatement(consulta);

            DaoUsuario d = new DaoUsuario();

            //-------------------------------------------------
            statement.setString(1, esq.getNombreExp());
            statement.setInt(2, esq.getCurso());
            statement.setString(3, esq.getAsignatura());
            statement.setString(4, esq.getTema());
            statement.setString(5, esq.getDescripcion());
            statement.setInt(6, (d.objetoUsario(esq.getIdUser().getIdUser())).getIdUser());
            statement.setString(7, esq.getApoyo());
            statement.setInt(8,1);
            //-----------------------------------------------

            //3.Hacer la ejecucion
            resultado = statement.execute();
            resultado = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    public Experiencia objetoExperiencia(int idExp) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        String query;
        Experiencia esq = null;
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Statement stmt = (Statement) conexion.createStatement();
        query = "SELECT * FROM Experiencia WHERE idExp=" + idExp + ";";
        stmt.executeQuery(query);
        ResultSet rs = stmt.getResultSet();

        System.out.println(query);

        DaoUsuario d = new DaoUsuario();

        while (rs.next()) {
            esq = new Experiencia();

            esq.setIdExp(rs.getInt("idExp"));
            esq.setNombreExp(rs.getString("nombreExp"));
            esq.setCurso(rs.getInt("curso"));
            esq.setAsignatura(rs.getString("asigantura"));
            esq.setTema(rs.getString("tema"));
            esq.setDescripcion(rs.getString("descripcion"));
            esq.setIdUser(d.objetoUsario(rs.getInt("IdUser")));
            esq.setApoyo(rs.getString("apoyo"));
            

        }

        return esq;
    }

    public void deleteEsquema(int idEsquema) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

        try {
            PreparedStatement preparedStatement = conexion.prepareStatement("delete from esquema where idEsquema=?");
            // Parameters start with 1
            preparedStatement.setInt(1, idEsquema);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Experiencia> getExperiencia() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        ArrayList<Experiencia> historial = new ArrayList<Experiencia>();
        Statement stmt = (Statement) conexion.createStatement();
        String query = "SELECT * FROM Experiencia;";
        stmt.executeQuery(query);
        ResultSet rs = stmt.getResultSet();

        Experiencia esq = new Experiencia();
        DaoUsuario dd = new DaoUsuario();

        while (rs.next()) {
            esq = new Experiencia();
            esq.setIdExp(rs.getInt("idExp"));
            esq.setNombreExp(rs.getString("nombreExp"));
            esq.setCurso(rs.getInt("curso"));
            esq.setAsignatura(rs.getString("asignatura"));
            esq.setTema(rs.getString("tema"));
            esq.setDescripcion(rs.getString("descripcion"));
            esq.setIdUser(dd.objetoUsario(rs.getInt("IdUser")));
            esq.setApoyo(rs.getString("apoyo"));
            

            historial.add(esq);

        }
        return historial;
    }

    public ArrayList<Experiencia> misExperiencias(int idUser) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        ArrayList<Experiencia> historial = new ArrayList<Experiencia>();
        Statement stmt = (Statement) conexion.createStatement();
        String query = "SELECT * FROM Experiencia WHERE idUser=" + idUser + ";";
        stmt.executeQuery(query);
        ResultSet rs = stmt.getResultSet();

        Experiencia esq = new Experiencia();
        DaoUsuario dd = new DaoUsuario();

        while (rs.next()) {
            esq = new Experiencia();
            esq.setIdExp(rs.getInt("idExp"));
            esq.setNombreExp(rs.getString("nombreExp"));
            esq.setCurso(rs.getInt("curso"));
            esq.setAsignatura(rs.getString("asignatura"));
            esq.setTema(rs.getString("tema"));
            esq.setDescripcion(rs.getString("descripcion"));
            esq.setIdUser(dd.objetoUsario(rs.getInt("IdUser")));
             esq.setApoyo(rs.getString("apoyo"));

            historial.add(esq);

        }
        return historial;
    }

  
}
