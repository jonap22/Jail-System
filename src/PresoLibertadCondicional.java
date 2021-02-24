/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faustito
 */
public class PresoLibertadCondicional extends PresoProcesoLibertad {
    //Variables
    private int tiempoRestante;
    private String motivoLibCond;
    
    //Métodos
    public void calculoTiempoRestante(){}
    public void motivoLibCond(){}
    
    //Get
    public String getMotivoLibCond() {
        return motivoLibCond;
    }
    
    public int getTiemporestante() {
        return tiempoRestante;
    }
    
    //Set
    
    public void setMotivoLibCond(String motivoLibCond) {
        this.motivoLibCond = motivoLibCond;
    }

    public void setTiemporestante(int tiemporestante) {
        this.tiempoRestante = tiemporestante;
    }
    
    //Comstructor con datos

    public PresoLibertadCondicional(int tiempoRestante, String motivoLibCond, 
            String nombre, String apellido, String nacionalidad,
            int documentoDeIdentidad, String fechaDeNacimiento, 
            String fechaDeIngreso, boolean reincidencia, 
            boolean estadoDeSentencia, int nivelDePeligrosidad, String delito) {
        
        super(nombre, apellido, nacionalidad, 
                documentoDeIdentidad, fechaDeNacimiento, 
                fechaDeIngreso, reincidencia, 
                estadoDeSentencia, nivelDePeligrosidad, delito);
        this.tiempoRestante = tiempoRestante;
        this.motivoLibCond = motivoLibCond;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "PresoLibertadCondicional{" + "tiempoRestante=" + tiempoRestante 
                + ", motivoLibCond=" + motivoLibCond + '}';
    }
    
}
