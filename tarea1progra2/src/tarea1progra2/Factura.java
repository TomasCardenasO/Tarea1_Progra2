package tarea1progra2;

import java.util.Date;

public class Factura extends DocTributario{
    public Factura(int numero, String rut, Direccion d, Date fecha) {
        super(numero, rut, d);
    }
    public String getFactura(){
        return ("numero: " + getNumero() + ",rut: " + getRut() + ",direccion: " + getDireccion() + ",fecha:" + getFecha());
    }
}
