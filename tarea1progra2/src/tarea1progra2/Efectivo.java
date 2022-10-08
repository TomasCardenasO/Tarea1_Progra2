package tarea1progra2;

public class Efectivo extends Pago {
    double porPagar;
    double pago;https://github.com/TomasCardenasO/Tarea1_Progra2.githttps://github.com/TomasCardenasO/Tarea1_Progra2.git
    public Efectivo(double pago, double porpagar) {
        super(pago);
        this.porPagar = porpagar;
        this.pago = pago;
    }
    public double calcDevolucion() {
        if(porpagar < pago)
        {
            double vuelto = porPagar - monto; //en este caso SOLO si el monto es menor al precio con iva a pagar
            return vuelto;
        }
    }
}
