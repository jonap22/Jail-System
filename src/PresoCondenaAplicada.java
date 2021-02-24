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
    
    //Constructor
    public PresoCondenaAplicada(double tiempoDeCondena, String JuezEncargado, 
            String nombre, String apellido, 
            String nacionalidad, int documentoDeIdentidad, 
            String fechaDeNacimiento, String fechaDeIngreso, 
            boolean reincidencia, boolean estadoDeSentencia, 
            int nivelDePeligrosidad, String delito) {
        
        super(nombre, apellido, nacionalidad, 
                documentoDeIdentidad, fechaDeNacimiento, 
                fechaDeIngreso, reincidencia, 
                estadoDeSentencia, nivelDePeligrosidad, delito);
        
        this.tiempoDeCondena = tiempoDeCondena;
        this.JuezEncargado = JuezEncargado;
        
    }
    
    
    //toString
    @Override
    public String toString() {
        return "PresoCondenaAplicada{" + "tiempoDeCondena=" + tiempoDeCondena 
                + ", JuezEncargado=" + JuezEncargado + '}';
    }
    
}
