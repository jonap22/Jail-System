
/**
*@author Otame
*@Date Monday, March 15
*@version 1.2
*/

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class PresoProcesoLibertad extends Preso{
    //Variables
    private String juezEncargado;
    private Date fechaDeSolicitud;

    //Métodos
    
    //Get
    public String getJuezencargado() {
        return juezEncargado;
    }

    public Date getFechadesolicitud() {
        return fechaDeSolicitud;
    }

    //Set
    public void setJuezencargado(String juezencargado) {
        this.juezEncargado = juezencargado;
    }

    public void setFechadesolicitud(Date fechadesolicitud) {
        this.fechaDeSolicitud = fechadesolicitud;
    }

    @Override
    protected String arresto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    //Constructores
    public PresoProcesoLibertad(String nombre, String apellido, 
            String nacionalidad, int documentoDeIdentidad, 
            Date fechaDeNacimiento, Date fechaDeIngreso, 
            String reincidencia, String estadoDeSentencia, 
            int nivelDePeligrosidad, String delito) {
        super(nombre, apellido, nacionalidad, 
                documentoDeIdentidad, fechaDeNacimiento, 
                fechaDeIngreso, reincidencia, 
                estadoDeSentencia, nivelDePeligrosidad, delito);
    }
    
    //Constructor con juezEncargado y fechaSolicitud
    public PresoProcesoLibertad(String juezEncargado, Date fechaDeSolicitud, 
            String nombre, String apellido, 
            String nacionalidad, int documentoDeIdentidad, 
            Date fechaDeNacimiento, Date fechaDeIngreso, 
            String reincidencia, String estadoDeSentencia, 
            int nivelDePeligrosidad, String delito) {
        
        super(nombre, apellido, nacionalidad, 
                documentoDeIdentidad, fechaDeNacimiento, fechaDeIngreso, 
                reincidencia, estadoDeSentencia, nivelDePeligrosidad, delito);
        
        this.juezEncargado = juezEncargado;
        this.fechaDeSolicitud = fechaDeSolicitud;
    }
    
    //toString
    @Override
    public String toString() {
        return "PresoProcesoLibertad{" + "juezEncargado=" + juezEncargado 
                + ", fechaDeSolicitud=" + fechaDeSolicitud + '}';
    }
    
}
