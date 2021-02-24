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
    private String carcelanterior;
    private String motivo;    
    //Métodos
    public void reasignacionCarcel(){}
    //Get
    public String getCarcelanterior() {
        return carcelanterior;
    }
    
    //Set
    public void setCarcelanterior(String carcelanterior) {
        this.carcelanterior = carcelanterior;
    }

    @Override
    protected String arresto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
