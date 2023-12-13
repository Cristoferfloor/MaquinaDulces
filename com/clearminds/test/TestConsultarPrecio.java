package com.clearminds.test;

import com.clearminds.maquina.Maquinadulces;

public class TestConsultarPrecio {
     public static void main(String[] args) {
        Maquinadulces maquina = new Maquinadulces();

        maquina.configurarMaquina("A1", "A2", "B1");

        
        consultarPrecio(maquina, "B1");
    }

    private static void consultarPrecio(Maquinadulces maquina, String codigoCelda) {
        double precio = maquina.consultarPrecio(codigoCelda);
        System.out.println("Precio en " + codigoCelda + ": " + precio);
    }
}
