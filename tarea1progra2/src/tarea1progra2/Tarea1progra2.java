package tarea1progra2;

public class Tarea1progra2 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Javier Vidal", "20295744-4", "Calle Superintendente Urbano 3050");
        Articulo ps2 = new Articulo(64, "Playstation 2", "Consola de videojuegos", 80000);
        Articulo gba = new Articulo(64, "GameBoy Advance", "Consola de videojuegos", 70000);
        Articulo xbox = new Articulo(64, "Xbox Classic", "Consola de videojuegos", 100000);
        Articulo psvita = new Articulo(64, "Playstation Vita", "Consola de videojuegos", 110000);
        OrdenCompra ordCom = new OrdenCompra(cliente);
        ordCom.setDetalle(ps2, 3);
        ordCom.setDetalle(gba, 2);
        ordCom.setDetalle(psvita, 1);
        ordCom.setDetalle(xbox, 1);
        
        double f = ordCom.calcPrecio();
        System.out.println(f);
        
        
        Efectivo pago1 = new Efectivo(800000, ordCom.calcPrecio()); 
        double g = pago1.calcDevolucion();
        System.out.println(g);
        
        
        
    }    
}