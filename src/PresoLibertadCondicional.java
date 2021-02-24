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
    private int tiemporestante;
    private String motivoLibCond;
    
    //Métodos
    public void calculoTiempoRestante(){}
    public void motivoLibCond(){}
    
    //Get
    public String getMotivoLibCond() {
        return motivoLibCond;
    }
    
    public int getTiemporestante() {
        return tiemporestante;
    }
    
    //Set
    
    public void setMotivoLibCond(String motivoLibCond) {
        this.motivoLibCond = motivoLibCond;
    }

    public void setTiemporestante(int tiemporestante) {
        this.tiemporestante = tiemporestante;
    }
    
}
