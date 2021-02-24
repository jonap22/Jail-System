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
    public void reasignacionCarcel(){}
    
    //Get
    public String getCarcelanterior() {
        return carcelAnterior;
    }
    
    //Set
    public void setCarcelanterior(String carcelanterior) {
        this.carcelAnterior = carcelanterior;
    }

    @Override
    protected String arresto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    //Constructor clase padre
    public PresoCumpliendoCondena(String nombre, String apellido, 
            String nacionalidad, int documentoDeIdentidad, 
            String fechaDeNacimiento, String fechaDeIngreso, 
            boolean reincidencia, boolean estadoDeSentencia, 
            int nivelDePeligrosidad, String delito) {
        super(nombre, apellido, nacionalidad, documentoDeIdentidad, 
                fechaDeNacimiento, fechaDeIngreso, reincidencia, 
                estadoDeSentencia, nivelDePeligrosidad, delito);
    }
    
    //Constructor con datos
    public PresoCumpliendoCondena(String carcelAnterior, String motivo, 
            String nombre, String apellido, String nacionalidad, 
            int documentoDeIdentidad, String fechaDeNacimiento, 
            String fechaDeIngreso, boolean reincidencia,
            boolean estadoDeSentencia, int nivelDePeligrosidad,
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
