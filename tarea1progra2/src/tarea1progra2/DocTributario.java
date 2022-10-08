package tarea1progra2;

import java.util.Date;

public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;
    
    //no debería de tener dirección también?
    public DocTributario(String numero, String rut, Direccion direccion) {
        this.numero = numero;
        this.rut = rut;
        fecha = new Date();
        this.direccion = direccion;
        
    }
    public String getNumero(){
        return numero;
        
    }
    public String getRut(){
        return rut;
        
    }
    public Date getFecha(){
        return fecha;
        
    }
    
}
