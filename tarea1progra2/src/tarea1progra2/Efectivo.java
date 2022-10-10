package tarea1progra2;

public class Efectivo extends Pago {
    double porPagar;
    public Efectivo(double monto, Cliente cliente, double porpagar) {
        super(monto, cliente);
        this.porPagar = porpagar;
    }
    public double calcDevolucion() {
        double vuelto = 0;
        if(porPagar < monto){
            vuelto = monto - porPagar; //en este caso SOLO si el monto es menor al precio con iva a pagar
        }
        return vuelto;
    }
}
