package tarea1progra2;

public class Tarea1progra2 {
    public static void main(String[] args) {
        
        //Creamos los clientes y los articulos
        Cliente cliente = new Cliente("Javier Vidal", "20295744-4", "Calle Superintendente Urbano 3050");
        Cliente benjamin = new Cliente("Benjamin Puerta", "21938348-k", "Calle Superintendente Urbano 3051");
        Articulo ps2 = new Articulo(64.8f, "Playstation 2", "Consola de videojuegos", 95200);
        Articulo gba = new Articulo(37.4f, "GameBoy Advance", "Consola de videojuegos", 83300);
        Articulo xbox = new Articulo(55.32f, "Xbox Classic", "Consola de videojuegos", 119000);
        Articulo psvita = new Articulo(80f, "Playstation Vita", "Consola de videojuegos", 130900);
        Articulo n64 = new Articulo(30.0f, "Nintendo 64", "Consola de videojuegos", 71400);
        
        //Realizamos las Ordenes de Compra
        OrdenCompra ordCom = new OrdenCompra(cliente);
        ordCom.setDetalle(gba, 2);
        ordCom.setDetalle(psvita, 1);
        ordCom.setDetalle(xbox, 1);
        
        OrdenCompra ordCom2 = new OrdenCompra(benjamin);
        ordCom2.setDetalle(gba, 1);
        ordCom2.setDetalle(n64, 1);
        
        OrdenCompra ordCom3 = new OrdenCompra(benjamin);
        ordCom3.setDetalle(ps2, 1);
        
        //Hacemos el pago de Javier Vidal
        System.out.println("Primera Orden:\n" + ordCom.toString());
        Tarjeta pagotar = new Tarjeta("Debito", "062342", 797300, cliente, 1);
        ordCom.Pagar(pagotar.getMonto());
        System.out.println("Pago:\n" + pagotar.toString());
        System.out.println("Boleta:\n" + pagotar.getterBoleta());
        System.out.println("Estado de la Orden: " + ordCom.getEstado());
        
        //Hacemos el pago de Benjamin
        System.out.println("Segunda Orden:\n" + ordCom2.toString());
        Transferencia transf = new Transferencia("Banco Estado", "0021938348", 100000, benjamin, 2);
        ordCom2.Pagar(transf.getMonto());
        System.out.println("Pago:\n" + transf.toString());
        System.out.println("Factura:\n" + transf.getterFactura());
        System.out.println("Estado de la Orden: " + ordCom2.getEstado());
        System.out.println("Queda por pagar: " + ordCom2.getDeuda());
        Efectivo efectivo1 = new Efectivo(54700, benjamin, 54700, 3);
        ordCom2.Pagar(efectivo1.getMonto());
        System.out.println("Segundo Pago:\n" + efectivo1.toString());
        System.out.println("Estado de la Orden: " + ordCom2.getEstado());
        //Pagamos la segunda orden de Benjamin
        System.out.println("Tercera Orden:\n" + ordCom3.toString());
        Efectivo efectivo2 = new Efectivo(100000, benjamin, 95200, 4);
        ordCom3.Pagar(efectivo2.getMonto());
        System.out.println("Pago:\n" + efectivo2.toString()); 
        System.out.println("Factura:\n" + efectivo2.getterFactura());
        System.out.println("Estado de la Orden: " + ordCom3.getEstado());
    }    
}