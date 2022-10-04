package tarea1progra2;

public class DetalleOrden {
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
        double peso = articulo.getPeso() * cantidad;
        return peso;
    }
}
