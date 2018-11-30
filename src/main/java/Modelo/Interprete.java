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
public class Interprete {
    
    
   int idInterprete ;
 String nombreArtista;

       public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public int getIdInterprete() {
        return idInterprete;
    }

    public void setIdInterprete(int idInterprete) {
        this.idInterprete = idInterprete;
    }

    @Override
    public String toString() {
        return "Interprete{" + "idInterprete=" + idInterprete + ", nombreArtista=" + nombreArtista + '}';
    }
    
    
    }
