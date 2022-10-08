package tarea1progra2;

import java.util.Date;

public class Pago {
    double monto;
    Date fecha;
    public Pago(double pago) {
        fecha = new Date();
        monto = pago;
        
        
    }
    public double getMonto(){
        return monto;
    }
}
