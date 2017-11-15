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
public class Comentario {
    
    private int IdCom;
    private String Descripcion; 
    Usuario idUser=new Usuario();
    Experiencia idExp = new Experiencia();

    public int getIdCom() {
        return IdCom;
    }

    public void setIdCom(int IdCom) {
        this.IdCom = IdCom;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Usuario getIdUser() {
        return idUser;
    }

    public void setIdUser(Usuario idUser) {
        this.idUser = idUser;
    }

    public Experiencia getIdExp() {
        return idExp;
    }

    public void setIdExp(Experiencia idExp) {
        this.idExp = idExp;
    }

    @Override
    public String toString() {
        return "Comentario{" + "IdCom=" + IdCom + ", Descripcion=" + Descripcion + ", idUser=" + idUser + ", idExp=" + idExp + '}';
    }
    
    

    }
