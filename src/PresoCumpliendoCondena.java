
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

public class PresoCumpliendoCondena extends Preso {

    //Variables
    private String carcelAnterior;
    private String motivo;

    //Métodos
    //Reasignación de cárcel
    public String reasignacionCarcel(String carcelAnterior, String motivo) {
        return "El preso se encontraba en la cárcel " + carcelAnterior 
                + " pero se lo va a reasignar a otro centro por"
                + " el siguiente motivo:" + motivo;
    }

    public String arresto() {
        String nombre = super.getNombre();
        int cedula = super.getDocumentoDeIdentidad();
        String delito = super.getDelito();
        Date fechaIngreso = super.getFechaDeIngreso();

        return "El arresto se realizó al individuo " + nombre + " con la cédula de identidad o"
                + " documeto de identidad " + cedula + " por el delito de " + delito + ", el individuo"
                + " fue ingresado a un centro de reclusión la fecha" + fechaIngreso + " el sujeto "
                + "se encuentra cumpliendo condena.";
    }

    //Get
    public String getCarcelanterior() {
        return carcelAnterior;
    }

    public String getMotivo() {
        return motivo;
    }

    //Set
    public void setCarcelanterior(String carcelanterior) {
        this.carcelAnterior = carcelanterior;
    }

    //Constructores
    public PresoCumpliendoCondena(String nombre, String apellido,
            String nacionalidad, int documentoDeIdentidad,
            Date fechaDeNacimiento, Date fechaDeIngreso,
            String reincidencia, String estadoDeSentencia,
            int nivelDePeligrosidad, String delito) {
        super(nombre, apellido, nacionalidad, documentoDeIdentidad,
                fechaDeNacimiento, fechaDeIngreso, reincidencia,
                estadoDeSentencia, nivelDePeligrosidad, delito);
    }

    //Constructor con carcelAnterior y motivo
    public PresoCumpliendoCondena(String carcelAnterior, String motivo,
            String nombre, String apellido, String nacionalidad,
            int documentoDeIdentidad, Date fechaDeNacimiento,
            Date fechaDeIngreso, String reincidencia,
            String estadoDeSentencia, int nivelDePeligrosidad,
            String delito) {

        super(nombre, apellido, nacionalidad, documentoDeIdentidad,
                fechaDeNacimiento, fechaDeIngreso,
                reincidencia, estadoDeSentencia,
                nivelDePeligrosidad, delito);

        this.carcelAnterior = carcelAnterior;
        this.motivo = motivo;
    }

    //toString
    @Override
    public String toString() {
        return "PresoCumpliendoCondena{" + "carcelAnterior=" + carcelAnterior
                + ", motivo=" + motivo + '}';
    }

}
