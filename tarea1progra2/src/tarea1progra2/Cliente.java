package tarea1progra2;

public class Cliente {
    private String nombre;
    private String rut;
    Direccion direccion;
    public Cliente(String nombre, String rut, String d) {
        this.nombre = nombre;
        this.rut = rut;
        Direccion direction = new Direccion(d);  
        this. direccion = direction;
    }
    public String getRut(){
        return rut;
    }
}