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
public class InterpreteSencillo {
    
    int idInterpreteSencillo;
    int idInterprete;
    int idSencillo;

    public int getIdInterpreteSencillo() {
        return idInterpreteSencillo;
    }

    public void setIdInterpreteSencillo(int idInterpreteSencillo) {
        this.idInterpreteSencillo = idInterpreteSencillo;
    }

    public int getIdInterprete() {
        return idInterprete;
    }

    public void setIdInterprete(int idInterprete) {
        this.idInterprete = idInterprete;
    }

    public int getIdSencillo() {
        return idSencillo;
    }

    public void setIdSencillo(int idSencillo) {
        this.idSencillo = idSencillo;
    }

    @Override
    public String toString() {
        return "InterpreteSencillo{" + "idInterpreteSencillo=" + idInterpreteSencillo + ", idInterprete=" + idInterprete + ", idSencillo=" + idSencillo + '}';
    }
    
    
    
    
}
