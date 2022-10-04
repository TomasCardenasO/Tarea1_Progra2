package tarea1progra2;

public class Efectivo extends Pago {
    public Efectivo() {
        super();
    }
    public float calcDevolucion(float efectivo) {
        float vuelto = efectivo - monto;
        return vuelto;
    }
}
