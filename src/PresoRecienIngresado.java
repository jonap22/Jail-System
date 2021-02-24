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
    private int numerodeingreso;
    
    //Métodos
    public void asigIndent(){}
    //Get
    
    public int getNumerodeingreso() {
        return numerodeingreso;
    }
    
    //Set
    public void setNumerodeingreso(int numerodeingreso) {
        this.numerodeingreso = numerodeingreso;
    }

    @Override
    protected String arresto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
