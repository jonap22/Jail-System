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
    public void asigIndent(){}
    
    //Get
    public int getNumerodeingreso() {
        return numeroDeIngreso;
    }
    
    //Set
    public void setNumerodeingreso(int numerodeingreso) {
        this.numeroDeIngreso = numerodeingreso;
    }

    @Override
    protected String arresto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
