package com.example;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 10");

        final double PRECIO_PRODUCTO = 15.99;
        final int IVA_PORCENTAJE = 16;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();

        double subtotal = PRECIO_PRODUCTO * cantidadProductos;
        double iva = subtotal * IVA_PORCENTAJE / 100;
        double total = subtotal + iva;

        System.out.println("-----FACTURA 001-----");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Cantidad de productos: " + cantidadProductos);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Iva: " + iva);
        System.out.println("Total: " + total);

        scanner.close();
    }

    }

