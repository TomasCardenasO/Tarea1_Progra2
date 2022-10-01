package tarea1progra2;
import java.util.Date;

public class Tarea1progra2 {

    public static void main(String[] args) {
        
    }
    
}
class Cliente {
    private String nombre;
    private String rut;
    Direccion direccion;
    public Cliente(Direccion d) {
        direccion = d;
    }
}
class Direccion {
    private String direccion;
    public Direccion(String direccion) {
        this.direccion = direccion;
    }
}
class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    public Articulo(float peso, String nombre, String descripcion, float precio) {
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public float getPrecio() {
        return precio;
    }
    public float getPeso() {
        return peso;
    }
}
class DetalleOrden {
    private int cantidad;
    Articulo articulo;
    public DetalleOrden(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }
    public double calcPrecioSinIVA() { //puede que la suma sea muy grande para el float, por eso es double
        double precioSinIVA = 0;
        for(int i = 0; i < cantidad; i++) {
            precioSinIVA += articulo.getPrecio();
        }
        return precioSinIVA;
    }
    public double calcIVA() {
        double iva = calcPrecioSinIVA() * 0.19; //Netbeans no aceptaba un float en este punto, por eso quedó como double
        return iva;
    }
    public double calcPrecio() {
        double precioConIVA = calcPrecioSinIVA() + calcIVA();
        return precioConIVA;
    }
    public double calcPeso() {
        double peso = 0;
        for(int i = 0; i < cantidad; i++) {
            peso += articulo.getPeso();
        }
        return peso;
    }
}
class OrdenCompra {
    private Date fecha;
    private String estado;
    private DetalleOrden detalleOrden;
    
}

