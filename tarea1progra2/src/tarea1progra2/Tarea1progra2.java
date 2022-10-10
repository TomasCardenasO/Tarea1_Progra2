package tarea1progra2;

public class Tarea1progra2 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Javier Vidal", "20295744-4", "Calle Superintendente Urbano 3050");
        Articulo ps2 = new Articulo(64.8f, "Playstation 2", "Consola de videojuegos", 95200);
        Articulo gba = new Articulo(37.4f, "GameBoy Advance", "Consola de videojuegos", 70000);
        Articulo xbox = new Articulo(55.32f, "Xbox Classic", "Consola de videojuegos", 100000);
        Articulo psvita = new Articulo(80f, "Playstation Vita", "Consola de videojuegos", 110000);
        OrdenCompra ordCom = new OrdenCompra(cliente);
        ordCom.setDetalle(ps2, 3);
        ordCom.setDetalle(gba, 2);
        ordCom.setDetalle(psvita, 1);
        ordCom.setDetalle(xbox, 1);
        
        double f = ordCom.calcPrecio();
        System.out.println("El precio total es de " + f + " pesos");
        System.out.println("El precio sin IVA total de los ps2 es " + ordCom.detallesOrden.get(0).calcPrecioSinIVA() + " pesos");
        System.out.println("El precio sin IVA total de los ps2 es " + ordCom.detallesOrden.get(0).calcPrecio() + " pesos");
        System.out.println("El precio sin IVA total de los xbox es " + ordCom.detallesOrden.get(3).calcPrecioSinIVA() + " pesos");
        System.out.println("El precio sin IVA total de los xbox es " + ordCom.detallesOrden.get(3).calcPrecio() + " pesos");
        System.out.println("El peso total del pedido es " + ordCom.calcPeso() + "kilos");
        
        Tarjeta pagotar = new Tarjeta("Debito"," 062342", 200000, cliente);
        ordCom.Pagar(pagotar.getMonto());
        
        System.out.println(pagotar.getterBoleta());
        
       
        Transferencia pagotrans = new Transferencia("Banco estado", "00020295744",50000, cliente);
        
        System.out.println(ordCom.getEstado());
        
        ordCom.Pagar(pagotrans.getMonto());
        
        
        Efectivo pagoefectivo = new Efectivo(2000000,cliente, ordCom.getDeuda());
        ordCom.Pagar(pagoefectivo.getMonto());
        
        System.out.println("Faltan " + ordCom.getDeuda() + " por pagar");
        System.out.println("El vuelto es de " + pagoefectivo.calcDevolucion() + " pesos");
        System.out.println("Faltanss " + ordCom.getDeuda() );
        
        System.out.println(ordCom.getEstado());
        System.out.println(pagotar.getterBoleta());
        
        
        
    
             
    }    
}