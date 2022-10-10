package tarea1progra2;

public class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion;
    public Tarjeta(String tipo, String numTransaccion, double monto, Cliente cliente, int n) {
        super(monto, cliente, n);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
    public String toString() {
        return "Pago con Tarjeta. " + super.toSring() + ", Tipo Tarjeta: " + tipo + ", Numero de Transaccion: " + numTransaccion;
    }
}
