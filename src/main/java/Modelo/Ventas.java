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
public class Ventas {
    
    int idVentas;
    String Fecha;
    int idSencillo;
    int idAlbum;

    public int getIdVentas() {
        return idVentas;
    }

    public String getFecha() {
        return Fecha;
    }

    public int getIdSencillo() {
        return idSencillo;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setIdSencillo(int idSencillo) {
        this.idSencillo = idSencillo;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    @Override
    public String toString() {
        return "Ventas{" + "idVentas=" + idVentas + ", Fecha=" + Fecha + ", idSencillo=" + idSencillo + ", idAlbum=" + idAlbum + '}';
    }
    
        
}
