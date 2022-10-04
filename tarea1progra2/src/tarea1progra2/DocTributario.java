package tarea1progra2;

import java.util.Date;

public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    public DocTributario(String numero, String rut) {
        this.numero = numero;
        this.rut = rut;
        fecha = new Date();
    }
}
