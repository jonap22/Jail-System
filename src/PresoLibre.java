
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faustito
 */
public class PresoLibre extends PresoProcesoLibertad{
    //Variables
    private Date fechaDeSalida;
    
    //Métodos
    public String arresto(){
    String nombre=super.getNombre();
    int cedula=super.getDocumentodeindentidad();
    String delito=super.getDelito();
    Date fechaIngreso=super.getFechadeingreso();
    return "El arresto se realizo al individuo "+nombre+" con la cedula de identidad o"
            + " documeto de identidad "+cedula+" por el delito de "+delito+", el individuo"
            + " fue ingresado a un centro de reclucion la fecha"+fechaIngreso;
    }
    //Get
    public Date getFechadesalida() {
        return fechaDeSalida;
    }
    
    //Set
    public void setFechadesalida(Date fechadesalida) {
        this.fechaDeSalida = fechadesalida;
    }
    
    //Constructor clase padre - hija
    public PresoLibre(Date fechaDeSalida, String juezEncargado, 
            Date fechaDeSolicitud, String nombre, String apellido,
            String nacionalidad, int documentoDeIdentidad, 
            Date fechaDeNacimiento, Date fechaDeIngreso, 
            boolean reincidencia, boolean estadoDeSentencia, 
            int nivelDePeligrosidad, String delito) {
        
        super(juezEncargado, fechaDeSolicitud, nombre, 
                apellido, nacionalidad, documentoDeIdentidad, 
                fechaDeNacimiento, fechaDeIngreso, reincidencia, 
                estadoDeSentencia, nivelDePeligrosidad, delito);
        
        this.fechaDeSalida = fechaDeSalida;
    }
    
    //toString
    public void setFechaDeSalida(Date fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }
    
}
