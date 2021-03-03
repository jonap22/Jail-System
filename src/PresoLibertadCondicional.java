
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
    public void calculoTiempoRestante(int dia, int mes, int anio) {
        int diaA, mesA, anioA;
        String diaSA, mesSA, anioSA;
        //SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-DD");
        //instanciamos un objeto calendario
        Calendar c = Calendar.getInstance();
        //sacamos la fecha actual por partes en dia mes y anio
        diaA = c.get(Calendar.DAY_OF_MONTH);
        diaSA = String.valueOf(diaA);
        mesA = c.get(Calendar.MONTH);
        mesSA = String.valueOf(mesA);
        anioA = c.get(Calendar.YEAR);
        anioSA = String.valueOf(anioA);
        //definimos la fehcha inicial
        Calendar fechaInicial = new GregorianCalendar();
        fechaInicial.set(anio, mes, dia);
        //definimos la fecha final
        Calendar fechaFinal = new GregorianCalendar();
        fechaFinal.set(diaA, mesA, anioA);
        //sacamos la resta de las dos fechas en milisegundos para obtener los dias exactos que tiene el preso para estar libre
        c.setTimeInMillis(fechaFinal.getTime().getTime() - fechaInicial.getTime().getTime());
        System.out.println("Numero de dias que tiene restantes de condena:" + c.get(Calendar.DAY_OF_YEAR));
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
