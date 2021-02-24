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
    private String fechaDeSalida;
    
    //Métodos
    
    //Get
    public String getFechadesalida() {
        return fechaDeSalida;
    }
    
    //Set
    public void setFechadesalida(String fechadesalida) {
        this.fechaDeSalida = fechadesalida;
    }
    
    //Constructor clase padre - hija
    public PresoLibre(String fechaDeSalida, String juezEncargado, 
            int fechaDeSolicitud, String nombre, String apellido,
            String nacionalidad, int documentoDeIdentidad, 
            String fechaDeNacimiento, String fechaDeIngreso, 
            boolean reincidencia, boolean estadoDeSentencia, 
            int nivelDePeligrosidad, String delito) {
        
        super(juezEncargado, fechaDeSolicitud, nombre, 
                apellido, nacionalidad, documentoDeIdentidad, 
                fechaDeNacimiento, fechaDeIngreso, reincidencia, 
                estadoDeSentencia, nivelDePeligrosidad, delito);
        
        this.fechaDeSalida = fechaDeSalida;
    }
    
    //toString
    public void setFechaDeSalida(String fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }
    
}
