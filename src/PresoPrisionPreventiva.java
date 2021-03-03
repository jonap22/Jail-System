
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
public class PresoPrisionPreventiva extends PresoRecienIngresado{
    //Variables
    private String juezEncargado;
    
    //Métodos
    public String arresto(){
    String nombre=super.getNombre();
    return "El arresto se realizo al individuo "+nombre;
    }
    //Get
    public String getJuezencargado() {
        return juezEncargado;
    }
    
    //Set
    public void setJuezencargado(String juezencargado) {
        this.juezEncargado = juezencargado;
    }
    
    //Constructor
    public PresoPrisionPreventiva(String juezEncargado, int numeroDeIngreso, 
            String nombre, String apellido, 
            String nacionalidad, int documentoDeIdentidad,
            Date fechaDeNacimiento, Date fechaDeIngreso, 
            boolean reincidencia, boolean estadoDeSentencia, 
            int nivelDePeligrosidad, String delito) {
        
        super(numeroDeIngreso, nombre, 
                apellido, nacionalidad,
                documentoDeIdentidad, fechaDeNacimiento, 
                fechaDeIngreso, reincidencia, 
                estadoDeSentencia, nivelDePeligrosidad, delito);
        
        this.juezEncargado = juezEncargado;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "PresoPrisionPreventiva{" + "juezEncargado=" + juezEncargado + '}';
    }
    
}
