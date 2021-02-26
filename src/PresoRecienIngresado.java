/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junio
 */
public class PresoRecienIngresado extends Preso {
    //Variables
    private int numeroDeIngreso;

    //Métodos
    public void asigIndent(int indent){
        this.numeroDeIngreso=indent;
    }
    
    //Get
    public int getNumerodeingreso() {
        return numeroDeIngreso;
    }
    
    //Set
    public void setNumerodeingreso(int numerodeingreso) {
        this.numeroDeIngreso = numerodeingreso;
    }
    
    //Constructor clase padre
    public PresoRecienIngresado(String nombre, String apellido, 
            String nacionalidad, int documentoDeIdentidad, 
            String fechaDeNacimiento, String fechaDeIngreso,
            boolean reincidencia, boolean estadoDeSentencia, 
            int nivelDePeligrosidad, String delito) {
        
        super(nombre, apellido, 
                nacionalidad, documentoDeIdentidad, 
                fechaDeNacimiento, fechaDeIngreso, 
                reincidencia, estadoDeSentencia, 
                nivelDePeligrosidad, delito);
        
    }
    
    //Constructor con datos
    public PresoRecienIngresado(int numeroDeIngreso, String nombre, 
            String apellido, String nacionalidad, 
            int documentoDeIdentidad, String fechaDeNacimiento, 
            String fechaDeIngreso, boolean reincidencia, 
            boolean estadoDeSentencia, int nivelDePeligrosidad, 
            String delito) {
        
        super(nombre, apellido, nacionalidad, 
                documentoDeIdentidad, fechaDeNacimiento, 
                fechaDeIngreso, reincidencia, 
                estadoDeSentencia, nivelDePeligrosidad, delito);
        this.numeroDeIngreso = numeroDeIngreso;
    }
    
    //toString
    @Override
    protected String arresto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
