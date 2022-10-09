package tarea1progra2;

import java.util.Date;

public class Pago {
    double monto;
    Date fecha;
    public Pago(double monto) {
        fecha = new Date();
        this.monto = monto;   
    }
    
    public double getMonto(){
        return monto;
    }
}
