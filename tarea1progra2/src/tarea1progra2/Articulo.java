package tarea1progra2;

public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precioconIVA;
    public Articulo(float peso, String nombre, String descripcion, float precioconIVA) {
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioconIVA = precioconIVA;
    }
    public float getPrecio() {
        return precioconIVA;
    }
    public float getPeso() {
        return peso;
    }
    public String getNombre() {
        return nombre;
    }
    public String toString() {
        return "Nombre Articulo: " + nombre + ", Precio: " + precioconIVA + ", Peso: " + peso;
    }
}
