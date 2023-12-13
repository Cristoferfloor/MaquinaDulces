package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.Maquinadulces;

public class TestConfiguracion {
    public static void main(String[] args) {
       
        Maquinadulces maquina = new Maquinadulces();

        
        maquina.configurarMaquina("A1", "A2", "B1");

        
        maquina.mostrarConfiguracion();

        Producto producto1 = new Producto("Cachitos", 0.50, "sdss");
        Producto producto2 = new Producto("doritos", 0.50, "hsggd");

        
        maquina.cargarProducto(producto1, "A1", 10);
        maquina.cargarProducto(producto2, "A2", 5);

        
        maquina.mostrarProductos();
    }
}
