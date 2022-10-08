package tarea1progra2;

public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    public Transferencia(String banco, String numCuenta, double pago) {
        super(pago);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
}
