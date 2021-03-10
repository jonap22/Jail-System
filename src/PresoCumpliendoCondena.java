
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junio
 */
public class PresoCumpliendoCondena extends Preso{
    //Variables
    private String carcelAnterior;
    private String motivo;    
    
    //Métodos
    public String reasignacionCarcel(String carcelAnterior,String motivo){
    return "El preso se encontraba en la carcel "+carcelAnterior+" pero se lo va a reasignar a otro centro por el siguiente motivo:"+motivo;
    }
    public String arresto(){
    String nombre=super.getNombre();
    int cedula=super.getDocumentoDeIdentidad();
    String delito=super.getDelito();
    Date fechaIngreso=super.getFechaDeIngreso();
    return "El arresto se realizo al individuo "+nombre+" con la cedula de identidad o"
            + " documeto de identidad "+cedula+" por el delito de "+delito+", el individuo"
            + " fue ingresado a un centro de reclucion la fecha"+fechaIngreso+" el sujeto "
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
    //Constructor clase padre
    public PresoCumpliendoCondena(String nombre, String apellido, 
            String nacionalidad, int documentoDeIdentidad, 
            Date fechaDeNacimiento, Date fechaDeIngreso, 
            String reincidencia, String estadoDeSentencia, 
            int nivelDePeligrosidad, String delito) {
        super(nombre, apellido, nacionalidad, documentoDeIdentidad, 
                fechaDeNacimiento, fechaDeIngreso, reincidencia, 
                estadoDeSentencia, nivelDePeligrosidad, delito);
    }
    
    //Constructor con datos
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
