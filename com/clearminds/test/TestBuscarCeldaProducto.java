package com.clearminds.test;

import com.clearminds.maquina.Maquinadulces;

public class TestBuscarCeldaProducto {

    public static void main(String[] args) {
        Maquinadulces maquina = new Maquinadulces();

        maquina.configurarMaquina("A1", "A2", "B1");

        
        buscarCeldaProducto(maquina, "KE34");
    }

    private static void buscarCeldaProducto(Maquinadulces maquina, String codigoProducto) {
       
        com.clearminds.componentes.Celda celdaEncontrada = maquina.buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            System.out.println("Celda que contiene el producto: " + celdaEncontrada.getCodigo());
        } else {
            System.out.println("El producto no se encuentra en ninguna celda.");
        }
    }
}
