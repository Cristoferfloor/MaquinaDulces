package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.maquina.Maquinadulces;

public class TestBusqueda {

    public static void main(String[] args) {
        Maquinadulces maquina = new Maquinadulces();

        
        maquina.configurarMaquina("A1", "A2", "B1");

        
        maquina.mostrarConfiguracion();

    
        buscarCelda(maquina, "A2");
        buscarCelda(maquina, "C1");
    }

    private static void buscarCelda(Maquinadulces maquina, String codigoCelda) {
        Celda celdaEncontrada = maquina.buscarCelda(codigoCelda);
        if (celdaEncontrada != null) {
            System.out.println("Celda Encontrada: " + celdaEncontrada.getCodigo());
        } else {
            System.out.println("No existe la celda");
        }
    }

    }
    

