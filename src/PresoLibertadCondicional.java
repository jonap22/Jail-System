
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
/**
 *
 * @author Faustito
 */
public class PresoLibertadCondicional extends PresoProcesoLibertad {

    //Variables
    private int tiempoRestante;
    private String motivoLibCond;

    //Métodos
    //provisional 
    public int calculoTiempoRestante(Date fechaIngreso) {
        long tiempoFin, tiempoIngreso, dias;
        tiempoIngreso = fechaIngreso.getTime();
        Date fechaActual = new Date();
        tiempoFin = fechaActual.getTime();
        dias = (tiempoFin - tiempoIngreso) / (1000 * 60 * 60 * 24);
        return (int) dias;

    }

    public String motivoLibCond(String motivoLibCond) {
        return "El motivo por el cual se le cede al preso el beneficio de la libertad condicional es el siguiente:" + motivoLibCond;
    }

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
            int documentoDeIdentidad, Date fechaDeNacimiento,
            Date fechaDeIngreso, boolean reincidencia,
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
