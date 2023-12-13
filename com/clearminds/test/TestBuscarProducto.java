package com.clearminds.test;

import com.clearminds.maquina.Maquinadulces;
import com.clearminds.componentes.Producto;

public class TestBuscarProducto {

    public static void main(String[] args) {
        Maquinadulces maquina = new Maquinadulces();

        
        maquina.configurarMaquina("A1", "A2", "B1");

        
        Producto papitas = new Producto("Papitas", 0.85, "KE34");
        maquina.cargarProducto(papitas, "B1", 4);

       
        maquina.mostrarProductos();

        
        buscarProductoEnCelda(maquina, "B1");
        buscarProductoEnCelda(maquina, "A1");
    }

    private static void buscarProductoEnCelda(Maquinadulces maquina, String codigoCelda) {
        System.out.println("***********CELDA " + codigoCelda);
        Producto productoEncontrado = maquina.buscarProductoEnCelda(codigoCelda);
        if (productoEncontrado != null) {
            System.out.println("Stock: " + maquina.buscarCelda(codigoCelda).getStock());
            System.out.println("Nombre Producto: " + productoEncontrado.getNombre());
            System.out.println("Precio Producto: " + productoEncontrado.getPrecio());
            System.out.println("Código Producto: " + productoEncontrado.getCodigo());
        } else {
            System.out.println("La celda no tiene producto!!!");
        }
    }
}
