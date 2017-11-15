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
public class Calificacion {
    
    private int idCal;
    private int Calificacion;
    
  Usuario userLocal=new Usuario();
  Usuario userExt = new Usuario();

    public int getIdCal() {
        return idCal;
    }

    public void setIdCal(int idCal) {
        this.idCal = idCal;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    public Usuario getUserLocal() {
        return userLocal;
    }

    public void setUserLocal(Usuario userLocal) {
        this.userLocal = userLocal;
    }

    public Usuario getUserExt() {
        return userExt;
    }

    public void setUserExt(Usuario userExt) {
        this.userExt = userExt;
    }

    @Override
    public String toString() {
        return "Calificacion{" + "idCal=" + idCal + ", Calificacion=" + Calificacion + ", userLocal=" + userLocal + ", userExt=" + userExt + '}';
    }
    
  
}
