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
public class AlbumSencillo {
    
    int idAlbumSencillo;
    int idSencillo;
    int idAlbum;

    public int getIdAlbumSencillo() {
        return idAlbumSencillo;
    }

    public int getIdSencillo() {
        return idSencillo;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbumSencillo(int idAlbumSencillo) {
        this.idAlbumSencillo = idAlbumSencillo;
    }

    public void setIdSencillo(int idSencillo) {
        this.idSencillo = idSencillo;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    @Override
    public String toString() {
        return "AlbumSencillo{" + "idAlbumSencillo=" + idAlbumSencillo + ", idSencillo=" + idSencillo + ", idAlbum=" + idAlbum + '}';
    }
    
    
            
    
}
