
package Modelo;


public class Album {
    
   int idAlbum;
   String NombreAlbum;
   int casilla;

    public int getCasilla() {
        return casilla;
    }

    public void setCasilla(int casilla) {
        this.casilla = casilla;
    }
    public int getIdAlbum() {
        return idAlbum;
    }

    public String getNombreAlbum() {
        return NombreAlbum;
    }


    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public void setNombreAlbum(String NombreAlbum) {
        this.NombreAlbum = NombreAlbum;
    }

    @Override
    public String toString() {
        return "Album{" + "idAlbum=" + idAlbum + ", NombreAlbum=" + NombreAlbum + ", casilla=" + casilla + '}';
    }

   
}
