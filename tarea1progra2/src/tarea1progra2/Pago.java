package tarea1progra2;
import java.util.Random;
import java.util.Date;


public class Pago {
    double monto;
    private Date fecha;
    private Cliente cliente;
    private Boleta equis;
    private Factura factura;
   
    public Pago(double monto, Cliente cliente, int n) {
        this.cliente = cliente;
        fecha = new Date();
        this.monto = monto;
        factura = new Factura(n + 3000, cliente.getRut(), cliente.direccion, fecha);
        Boleta boleta = new Boleta(n + 3000, cliente.getRut(), cliente.direccion, fecha); //cliente.getFecha()
        equis = boleta;
    }
    
    public double getMonto(){
        return monto;
    }
    public String getterBoleta(){
        return equis.getBoleta();   
    }
    public String getterFactura() {
        return factura.getFactura();
    }
    public String toSring() {
        return "A nombre de: " + cliente.getNombre() + ", Monto: " + monto + ", Fecha: " + fecha;
    }
    
}

