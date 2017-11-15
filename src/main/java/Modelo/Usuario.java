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
public class Usuario {
    
private int idUser;
private String Email;
 private String Pswd;
 private String NombreUser;
 private String Apellido;
 private String Colegio;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPswd() {
        return Pswd;
    }

    public void setPswd(String Pswd) {
        this.Pswd = Pswd;
    }

    public String getNombreUser() {
        return NombreUser;
    }

    public void setNombreUser(String NombreUser) {
        this.NombreUser = NombreUser;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getColegio() {
        return Colegio;
    }

    public void setColegio(String Colegio) {
        this.Colegio = Colegio;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUser=" + idUser + ", Email=" + Email + ", Pswd=" + Pswd + ", NombreUser=" + NombreUser + ", Apellido=" + Apellido + ", Colegio=" + Colegio + '}';
    }

 
    
    
}
