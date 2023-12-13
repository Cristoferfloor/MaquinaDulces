package com.clearminds.test;

import com.clearminds.maquina.Maquinadulces;

public class TestVenderConCambio {
    public static void main(String[] args) {
        Maquinadulces maquina = new Maquinadulces();

      
        maquina.configurarMaquina("A1", "A2", "B1");

       
        maquina.cargarProducto("D456", "A2", 1, 0.7);
        maquina.mostrarProductos();
        double cambio = maquina.venderConCambio("A2", 1.7);

        
        maquina.mostrarProductos();

        System.out.println("SU CAMBIO ES: " + cambio);
    }
}
