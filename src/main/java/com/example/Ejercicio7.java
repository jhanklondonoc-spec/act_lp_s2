package com.example;

public class Ejercicio7 {
    public static void main(String[] args){
        System.out.println("Ejercicio 7");
        // tu código aquí
        String nombre = "juan", apellido = "Pérez";
        String nombreCompleto = nombre + " " + apellido;
        String saludo = "hola ".concat(nombreCompleto);
        int edad = 20;
        String mensaje = "tengo " + edad + " años";
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Saludo: " + saludo);
        System.out.println( "Su edad es : " + edad);
        System.out.println("Mensaje: " + mensaje);
    
    }
}
