package tarea1progra2;

public class DetalleOrden {
    private int cantidad;
    Articulo articulo;
    public DetalleOrden(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }
    public double calcIVA() {
        return (calcPrecio() * (19.0 / 119.0));
    }
    public double calcPrecio() {
        return (articulo.getPrecio() * cantidad);
    }
    public double calcPrecioSinIVA() { //puede que la suma sea muy grande para el float, por eso es double
        return (calcPrecio() - calcIVA());
    }
    public double calcPeso() {
        return (articulo.getPeso() * cantidad);
    }
    public String toString() {
        return "Artculo del Detalle: " + articulo.getNombre() + ", Cantidad: " + cantidad + ", Total: " + calcPrecio() + ", Peso: " + calcPeso();
    }
}
