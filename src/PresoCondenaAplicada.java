/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faustito
 */
public class PresoCondenaAplicada extends PresoRecienIngresado {
    //Variables
    private double tiempoDeCondena;
    private String JuezEncargado;
    
    //Métodos
    public void condenaAplicada(){}
    //Get
    
    public double getTiempodecontena() {
        return tiempoDeCondena;
    }

    public String getJuezencargado() {
        return JuezEncargado;
    }
    
    //Set
    public void setTiempodecontena(double tiempodecontena) {
        this.tiempoDeCondena = tiempodecontena;
    }

    public void setJuezencargado(String juezencargado) {
        this.JuezEncargado = juezencargado;
    }
    
}
