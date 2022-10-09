package tarea1progra2;

import java.util.Date;
import java.util.ArrayList;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    public ArrayList<DetalleOrden> detallesOrden;  //debido a que nos sirve para concer los detalles de cada orden
    Cliente cliente;
    double deuda;
    
    public OrdenCompra(Cliente Cliente){ //por ahora
        this.cliente = cliente;
        fecha = new Date();
        estado = "pendiente de pago";
        detallesOrden = new ArrayList<DetalleOrden>();
        deuda = 0;
    }
    
    public double calcPrecioSinIVA(){
        double precioSinIVA = 0;
        for(int i = 0; i < detallesOrden.size(); i++) {
            precioSinIVA += detallesOrden.get(i).calcPrecioSinIVA();
        }
        return precioSinIVA;
    }
    
    public double calcIVA(){
        double iva = calcPrecioSinIVA() * 0.19;
        return iva;
    }
    
    public double calcPrecio(){
        double precioConIVA = calcPrecioSinIVA() + calcIVA();
        return precioConIVA;
    }
    
    public double calcPeso(){
        double peso = 0;
        for(int i = 0; i < detallesOrden.size(); i++) {
            peso += detallesOrden.get(i).calcPeso();
        }
        return peso;    
    }
    
    public void setDetalle(Articulo articulo, int cantidad){
        DetalleOrden Det = new DetalleOrden(articulo, cantidad);
        detallesOrden.add(Det);
        deuda += Det.calcPrecio();
    }
    
    public double getDeuda(){
        if (deuda < 0)
            deuda = 0;
        return deuda;
    }
    
    public void Pagar(double monto){
        deuda -= monto;
    }
}
