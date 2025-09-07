package com.example;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 8");
        // tu código aquí
         //  Identificadores válidos:

        // miVariable: comienza con una letra minuscula, sin espacios ni símbolos especiales
        int miVariable = 10;

        // _contador: los identificadores pueden comenzar con guión bajo
        int _contador = 20;

        // $precio: también pueden comenzar con el símbolo dólar (aunque no es comúnmente usado)
        int $precio = 30;

        // variable123: puede contener números, siempre que no empiece con uno
        int variable123 = 40;

        // Identificadores inválidos :

        // int 123variable = 50; //  No puede comenzar con un número
        // int mi-variable = 60; // El guion medio no está permitido en identificadores
        // int class = 70;       //  'class' es una palabra reservada del lenguaje
        // int public = 80;      // 'public' también es una palabra reservada

        //  Imprimir variables válidas
        System.out.println("miVariable: " + miVariable);
        System.out.println("_contador: " + _contador);
        System.out.println("$precio: " + $precio);
        System.out.println("variable123: " + variable123);

    }
}
