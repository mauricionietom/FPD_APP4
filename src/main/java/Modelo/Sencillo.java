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
public class Sencillo {
    
    int idSencillo;
    String Titulo;
    int Casilla;

    public int getIdSencillo() {
        return idSencillo;
    }

    public void setIdSencillo(int idSencillo) {
        this.idSencillo = idSencillo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getCasilla() {
        return Casilla;
    }

    public void setCasilla(int Casilla) {
        this.Casilla = Casilla;
    }

    @Override
    public String toString() {
        return "Sencillo{" + "idSencillo=" + idSencillo + ", Titulo=" + Titulo + ", Casilla=" + Casilla + '}';
    }
    
   
    
}
