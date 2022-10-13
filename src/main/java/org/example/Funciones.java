package org.example;
/**
 * Crear una funcion que reciba un precio y devuelva un precio con el iva incluido
 */
public class Funciones {
    public static void main(String[] args) {
        double precio = 50000;
        double precioConIva = precioSinIva(precio);
        double iva = precioConIva - precio;
        System.out.println("Precio sin Iva: " + precio);
        System.out.println("Precio con IVA: " + precioConIva);
        System.out.println("IVA : " + iva);


    }
        static double precioSinIva(double precio){
        return  (precio*0.19 + precio);
        }

    }