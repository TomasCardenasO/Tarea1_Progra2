package tarea1progra2;

public class Cliente {
    private String nombre;
    private String rut;
    public Cliente(String nombre, String rut, String d) {
        this.nombre = nombre;
        this.rut = rut;
        Direccion direccion = new Direccion(d);  
    }
}