package tarea1progra2;

public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    public Transferencia(String banco, String numCuenta, double monto, Cliente cliente, int n) {
        super(monto, cliente, n);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
    public String toString() {
        return "Pago con Transferencia. " + super.toSring() + ", Banco: " + banco + ", Numero de Cuenta: " + numCuenta;
    }
}
