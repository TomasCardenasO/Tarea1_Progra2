package tarea1progra2;

import java.util.Date;
import java.util.ArrayList;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> detallesOrden;
    public OrdenCompra(){
        fecha = new Date();
        estado = ;
        detallesOrden = new ArrayList<DetalleOrden>();
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
}
