/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junio
 */
public abstract class Preso {
    //Variables
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int documentodeindentidad;
    private int fechadenacimiento;
    private int fechadeingreso;
    private boolean reincidencia;    
    private boolean estadodesentecia;
    private int niveldepeligrosidad;
    private String delito;
    
    //Métodos
    protected abstract String arresto();
    
    //Get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getDocumentodeindentidad() {
        return documentodeindentidad;
    }

    public int getFechadenacimiento() {
        return fechadenacimiento;
    }

    public int getFechadeingreso() {
        return fechadeingreso;
    }

    public boolean isReincidencia() {
        return reincidencia;
    }

    public boolean isEstadodesentecia() {
        return estadodesentecia;
    }

    public int getNiveldepeligrosidad() {
        return niveldepeligrosidad;
    }

    public String getDelito() {
        return delito;
    }
    
    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setDocumentodeindentidad(int documentodeindentidad) {
        this.documentodeindentidad = documentodeindentidad;
    }

    public void setFechadenacimiento(int fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public void setFechadeingreso(int fechadeingreso) {
        this.fechadeingreso = fechadeingreso;
    }

    public void setReincidencia(boolean reincidencia) {
        this.reincidencia = reincidencia;
    }

    public void setEstadodesentecia(boolean estadodesentecia) {
        this.estadodesentecia = estadodesentecia;
    }

    public void setNiveldepeligrosidad(int niveldepeligrosidad) {
        this.niveldepeligrosidad = niveldepeligrosidad;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }
    
}
