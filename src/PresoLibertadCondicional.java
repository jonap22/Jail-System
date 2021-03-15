
/**
*@author Otame
*@Date Monday, March 15
*@version 1.2
*/

import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class PresoLibertadCondicional extends PresoProcesoLibertad {

    //Variables
    private String motivoLibCond;

    //Métodos
    //provisional 
    public String calculoTiempoRestante(Date fechaIngreso) {
        //Variables locales
        long tiempoFin, tiempoIngreso, dias;
        tiempoIngreso = fechaIngreso.getTime();
        Date fechaActual = new Date();
        tiempoFin = fechaActual.getTime();

        //Cálculo de días restantes
        dias = (tiempoFin - tiempoIngreso) / (1000 * 60 * 60 * 24);

        return "Los dias que el preso estuvo preso son los siguientes: " + dias;
    }
    
    //Métodos arresto
    public String arresto() {
        //Variables
        String nombre = super.getNombre();
        int cedula = super.getDocumentoDeIdentidad();
        String delito = super.getDelito();
        Date fechaIngreso = super.getFechaDeIngreso();
        
        //Presentación
        return "El arresto se realizo al individuo " + nombre + " con la cedula de identidad o"
                + " documeto de identidad " + cedula + " por el delito de " + delito + ", el individuo"
                + " fue ingresado a un centro de reclucion la fecha" + fechaIngreso + " en la actualidad"
                + " el sujeto se encuentra en libertad condicional.";
    }

    //Get
    public String getMotivoLibCond() {
        return motivoLibCond;
    }

    //Set
    public void setMotivoLibCond(String motivoLibCond) {
        this.motivoLibCond = motivoLibCond;
    }

    //Comstructor con datos
    public PresoLibertadCondicional(String motivoLibCond,
            String nombre, String apellido, String nacionalidad,
            int documentoDeIdentidad, Date fechaDeNacimiento,
            Date fechaDeIngreso, String reincidencia,
            String estadoDeSentencia, int nivelDePeligrosidad, String delito) {

        super(nombre, apellido, nacionalidad,
                documentoDeIdentidad, fechaDeNacimiento,
                fechaDeIngreso, reincidencia,
                estadoDeSentencia, nivelDePeligrosidad, delito);
        this.motivoLibCond = motivoLibCond;
    }

    //toString
    @Override
    public String toString() {
        return "PresoLibertadCondicional{" + ", motivoLibCond=" + motivoLibCond + '}';
    }

}
