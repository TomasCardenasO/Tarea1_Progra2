package tarea1progra2;

import java.util.Date;

public class DocTributario {
    private int numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;
    
    //no debería de tener dirección también?
    public DocTributario(int numero, String rut, Direccion direccion) {
        this.numero = numero;
        this.rut = rut;
        fecha = new Date();
        this.direccion = direccion;  
    }
    public int getNumero(){
        return numero;
    }
    public String getRut(){
        return rut;
    }
    public Date getFecha(){
        return fecha;
    }
    public String getDireccion(){
        return direccion.getDirection();
    }
}
