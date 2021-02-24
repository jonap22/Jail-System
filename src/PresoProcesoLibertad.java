/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junio
 */
public class PresoProcesoLibertad extends Preso{
    //Variables
    private String juezencargado;
    private int fechadesolicitud;
    //Métodos
    //Get
    public String getJuezencargado() {
        return juezencargado;
    }

    public int getFechadesolicitud() {
        return fechadesolicitud;
    }

    //Set
    public void setJuezencargado(String juezencargado) {
        this.juezencargado = juezencargado;
    }

    public void setFechadesolicitud(int fechadesolicitud) {
        this.fechadesolicitud = fechadesolicitud;
    }

    @Override
    protected String arresto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
