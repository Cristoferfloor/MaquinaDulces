package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class Maquinadulces {
    
    private Celda celda1;
    private Celda celda2;
    private Celda celda3;
    private double saldo;

    // Constructor por defecto
    public Maquinadulces() {
        // Inicializar las celdas y el saldo en 0
        this.celda1 = new Celda("C1");
        this.celda2 = new Celda("C2");
        this.celda3 = new Celda("C3");
        this.saldo = 0.0;
    }

    // Método para configurar la máquina con códigos de celdas
    public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3) {
        celda1.setCodigo(codigoCelda1);
        celda2.setCodigo(codigoCelda2);
        celda3.setCodigo(codigoCelda3);
    }

    // Método para mostrar la configuración de la máquina
    public void mostrarConfiguracion() {
        System.out.println("Celda 1: " + celda1.getCodigo());
        System.out.println("Celda 2: " + celda2.getCodigo());
        System.out.println("Celda 3: " + celda3.getCodigo());
        System.out.println("Saldo actual: " + saldo);
    }

    // Método para buscar una celda por su código
    public Celda buscarCelda(String codigoCelda) {
        if (celda1.getCodigo().equals(codigoCelda)) {
            return celda1;
        } else if (celda2.getCodigo().equals(codigoCelda)) {
            return celda2;
        } else if (celda3.getCodigo().equals(codigoCelda)) {
            return celda3;
        }
        return null; // Si no se encuentra la celda, retorna null
    }
    // Método para cargar productos en una celda
    public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        if (celdaRecuperada != null) {
            celdaRecuperada.ingresarProducto(producto, cantidad);
        }
    }

    // Método para mostrar productos de todas las celdas
    public void mostrarProductos() {
        System.out.println("Productos en Celda 1:");
        mostrarProductosEnCelda(celda1);
        System.out.println("Productos en Celda 2:");
        mostrarProductosEnCelda(celda2);
        System.out.println("Productos en Celda 3:");
        mostrarProductosEnCelda(celda3);
        System.out.println("Saldo actual: " + saldo);
    }

    // Método para mostrar productos en una celda específica
    private void mostrarProductosEnCelda(Celda celda) {
        if (celda.getProducto() != null) {
            System.out.println("Código Celda: " + celda.getCodigo());
            System.out.println("Stock: " + celda.getStock());
            System.out.println("Nombre Producto: " + celda.getProducto().getNombre());
            System.out.println("Precio Producto: " + celda.getProducto().getPrecio());
        } else {
            System.out.println("Celda vacía");
        }
    }

    // Método para buscar un producto en una celda
    public Producto buscarProductoEnCelda(String codigoCelda) {
        Celda celdaEncontrada = buscarCelda(codigoCelda);
        return (celdaEncontrada != null) ? celdaEncontrada.getProducto() : null;
    }

    // Método para consultar el precio de un producto en una celda
    public double consultarPrecio(String codigoCelda) {
        Producto producto = buscarProductoEnCelda(codigoCelda);
        return (producto != null) ? producto.getPrecio() : 0.0;
    }

    // Método para buscar la celda que contiene un producto
    public Celda buscarCeldaProducto(String codigoProducto) {
        if (celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
            return celda1;
        } else if (celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
            return celda2;
        } else if (celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
            return celda3;
        }
        return null;
    }

    // Método para incrementar la cantidad de productos en una celda
    public void incrementarProductos(String codigoProducto, int cantidadIncrementar) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidadIncrementar);
        }
    }

    // Método para vender un producto
    public void vender(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getStock() > 0) {
            Producto producto = celda.getProducto();
            celda.setStock(celda.getStock() - 1);
            saldo += producto.getPrecio();
            mostrarProductos();
        } else {
            System.out.println("La celda está vacía o el stock es insuficiente.");
        }
    }

    // Método para vender con cambio
    public double venderConCambio(String codigoCelda, double valorIngresado) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getStock() > 0) {
            Producto producto = celda.getProducto();
            double precioProducto = producto.getPrecio();

            if (valorIngresado >= precioProducto) {
                celda.setStock(celda.getStock() - 1);
                saldo += precioProducto;
                double cambio = valorIngresado - precioProducto;
                mostrarProductos();
                return cambio;
            } else {
                System.out.println("El valor ingresado es insuficiente.");
            }
        } else {
            System.out.println("La celda está vacía o el stock es insuficiente.");
        }
        return 0.0;
    }
}
