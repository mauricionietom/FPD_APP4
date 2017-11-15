/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mnieto
 */
public class Experiencia {
    
    private int idExp;
    private String NombreExp;
    private int Curso;
    private String Asignatura;
    private String Tema;
    private String Descripcion;
    
    Usuario idUser = new Usuario();

    public Usuario getIdUser() {
        return idUser;
    }

    public void setIdUser(Usuario idUser) {
        this.idUser = idUser;
    }
    
    

    public int getIdExp() {
        return idExp;
    }

    public void setIdExp(int idExp) {
        this.idExp = idExp;
    }

    public String getNombreExp() {
        return NombreExp;
    }

    public void setNombreExp(String NombreExp) {
        this.NombreExp = NombreExp;
    }

    public int getCurso() {
        return Curso;
    }

    public void setCurso(int Curso) {
        this.Curso = Curso;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "idExp=" + idExp + ", NombreExp=" + NombreExp + ", Curso=" + Curso + ", Asignatura=" + Asignatura + ", Tema=" + Tema + ", Descripcion=" + Descripcion + ", idUser=" + idUser + '}';
    }

    
    
}
