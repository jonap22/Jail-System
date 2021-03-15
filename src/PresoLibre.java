
/**
 *@author Otame
 * @Date Monday, March 15
 * @version 1.2
 */
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class PresoLibre extends PresoProcesoLibertad {
    //Variables

    //Métodos
    
    //Método arresto
    public String arresto() {
        //Variables
        String nombre = super.getNombre();
        int cedula = super.getDocumentoDeIdentidad();
        String delito = super.getDelito();
        Date fechaIngreso = super.getFechaDeIngreso();
        
        //Texto de retorno
        return "El arresto se realizo al individuo " + nombre + " con la cedula de identidad o"
                + " documeto de identidad " + cedula + " por el delito de " + delito + ", el individuo"
                + " fue ingresado a un centro de reclucion la fecha " + fechaIngreso + " en la actualidad"
                + " el sujeto se encuentra en libertad";
    }

    //Constructor clase padre - hija
    public PresoLibre(String nombre, String apellido,
            String nacionalidad, int documentoDeIdentidad,
            Date fechaDeNacimiento, Date fechaDeIngreso,
            String reincidencia, String estadoDeSentencia,
            int nivelDePeligrosidad, String delito) {

        super(nombre,
                apellido, nacionalidad, documentoDeIdentidad,
                fechaDeNacimiento, fechaDeIngreso, reincidencia,
                estadoDeSentencia, nivelDePeligrosidad, delito);

    }

    //toString
}
