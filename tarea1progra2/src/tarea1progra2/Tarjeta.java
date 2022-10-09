package tarea1progra2;

public class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion;
    public Tarjeta(String tipo, String numTransaccion, double monto) {
        super(monto);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
}
