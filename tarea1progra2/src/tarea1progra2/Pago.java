package tarea1progra2;

import java.util.Date;


public class Pago {
    double monto;
    private Date fecha;
    private Cliente cliente;
    private Boleta equis;
   
    public Pago(double monto, Cliente cliente ) {
   
        this.cliente = cliente;
        fecha = new Date();
        this.monto = monto; 
              
            
        
        Boleta boleta = new Boleta("3",cliente.getRut(), cliente.direccion, fecha); //cliente.getFecha()
        equis = boleta;
   
        
     
    }
    
    public double getMonto(){
        return monto;
    }
    public String getterBoleta(){
        return equis.getBoleta();
        
    }
    
}

