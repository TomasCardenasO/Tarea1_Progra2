package tarea1progra2;

public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    public Transferencia(String banco, String numCuenta, double monto) {
        super(monto);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
}
