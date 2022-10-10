package tarea1progra2;

import java.util.Date;

public class Boleta extends DocTributario {

    public Boleta(int numero, String rut, Direccion d, Date fecha) {
        super(numero, rut, d);
    }
    public String getBoleta(){
        return ("numero: " + getNumero() + ",rut:" + getRut() + ",direccion: " + getDireccion() + ",fecha:" + getFecha());
    }
}
