package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.Maquinadulces;

public class TestCargarProducto {

    public static void main(String[] args) {
        Maquinadulces maquina = new Maquinadulces();

        
        maquina.configurarMaquina("A1", "A2", "B1");

        maquina.mostrarConfiguracion();

        Producto producto = new Producto("Papitas", 0.85, "KE34");

        maquina.cargarProducto(producto, "B1", 4);

        maquina.mostrarProductos();
    }
    
}
