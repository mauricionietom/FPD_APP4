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
public class InterpreteAlbum {
    
    
        int idInterpreteAlbum;
        int idInterprete;
        int idAlbum;

    public int getIdInterpreteAlbum() {
        return idInterpreteAlbum;
    }

    public int getIdInterprete() {
        return idInterprete;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdInterpreteAlbum(int idInterpreteAlbum) {
        this.idInterpreteAlbum = idInterpreteAlbum;
    }

    public void setIdInterprete(int idInterprete) {
        this.idInterprete = idInterprete;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    @Override
    public String toString() {
        return "InterpreteAlbum{" + "idInterpreteAlbum=" + idInterpreteAlbum + ", idInterprete=" + idInterprete + ", idAlbum=" + idAlbum + '}';
    }
        
        
    
}
