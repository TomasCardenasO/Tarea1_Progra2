package tarea1progra2;

public class Cliente {
    private String nombre;
    private String rut;
    Direccion direccion;
    public Cliente(String nombre, String rut, Direccion d) {
        this.nombre = nombre;
        this.rut = rut;
        direccion = d;
    }
}
