package com.clearminds.test;

import com.clearminds.componentes.Producto;

public class TestProducto {

    public static void main(String[] args) {
   
        Producto P1 = new Producto("Papitas",0.85,"KE34");   
        System.out.println("Código: " + P1.getCodigo());
        System.out.println("Nombre: " + P1.getNombre());
        System.out.println("Precio: " + P1.getPrecio());


        System.out.println("-------------------------------------------------");
       
         P1.setPrecio(0.9);
         System.out.println("Nuevo Precio: " + P1.getPrecio());
     
         P1.incrementarPrecio(10); 
         System.out.println("Precio incrementado: " + P1.getPrecio());
     
         P1.setPrecio(1.0);
         System.out.println("Precio incrementado: " + P1.getPrecio());
    
        
    }

    

    
    
}
