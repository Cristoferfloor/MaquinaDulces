package com.clearminds.componentes;

public class Producto {

    private String nombre;  // Corregido el nombre del atributo

    private double precio;

    private String codigo;

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {  // Corregido el nombre del método
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    // Corregido el nombre del parámetro y la asignación de atributo
    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public void incrementarPrecio(int porcentajeIncremento) {
        if (porcentajeIncremento > 0) {
            double incremento = precio * (porcentajeIncremento / 100.0);
            precio += incremento;
            System.out.println("El nuevo precio después de un incremento del " + porcentajeIncremento + "% es: " + precio);
        } else {
            System.out.println("El porcentaje de incremento debe ser mayor que cero.");
        }
    }

    public void disminuirPrecio(double descuento) {
        if (descuento > 0) {
            precio -= descuento;
            System.out.println("El nuevo precio después de un descuento de " + descuento + " es: " + precio);
        } else {
            System.out.println("El descuento debe ser mayor que cero.");
        }
    }
}
