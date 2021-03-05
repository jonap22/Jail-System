
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

public abstract class Preso {
    //Variables
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int documentoDeIdentidad;
    private Date fechaDeNacimiento;
    private Date fechaDeIngreso;
    private String reincidencia;    
    private String estadoDeSentencia;
    private int nivelDePeligrosidad;
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
        return documentoDeIdentidad;
    }

    public Date getFechadenacimiento() {
        return fechaDeNacimiento;
    }

    public Date getFechadeingreso() {
        return fechaDeIngreso;
    }

    public String getReincidencia() {
        return reincidencia;
    }

    public String getEstadodesentecia() {
        return estadoDeSentencia;
    }

    public int getNiveldepeligrosidad() {
        return nivelDePeligrosidad;
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
        this.documentoDeIdentidad = documentodeindentidad;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        this.fechaDeNacimiento = fechadenacimiento;
    }

    public void setFechadeingreso(Date fechadeingreso) {
        this.fechaDeIngreso = fechadeingreso;
    }

    public void setReincidencia(String reincidencia) {
        this.reincidencia = reincidencia;
    }

    public void setEstadodesentecia(String estadodesentecia) {
        this.estadoDeSentencia = estadodesentecia;
    }

    public void setNiveldepeligrosidad(int niveldepeligrosidad) {
        this.nivelDePeligrosidad = niveldepeligrosidad;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }
    
    //Constructor
    public Preso(String nombre, String apellido, String nacionalidad, 
            int documentoDeIdentidad, Date fechaDeNacimiento, 
            Date fechaDeIngreso, String reincidencia, 
            String estadoDeSentencia, int nivelDePeligrosidad, String delito) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.fechaDeIngreso = fechaDeIngreso;
        this.reincidencia = reincidencia;
        this.estadoDeSentencia = estadoDeSentencia;
        this.nivelDePeligrosidad = nivelDePeligrosidad;
        this.delito = delito;
    }
    
    //toString
    @Override
    public String toString() {
        return "Preso{" + "nombre=" + nombre 
                + ", apellido=" + apellido 
                + ", nacionalidad=" + nacionalidad 
                + ", documentoDeIdentidad=" + documentoDeIdentidad 
                + ", fechaDeNacimiento=" + fechaDeNacimiento 
                + ", fechaDeIngreso=" + fechaDeIngreso 
                + ", reincidencia=" + reincidencia 
                + ", estadoDeSentencia=" + estadoDeSentencia 
                + ", nivelDePeligrosidad=" + nivelDePeligrosidad 
                + ", delito=" + delito + '}';
    }
    
}
