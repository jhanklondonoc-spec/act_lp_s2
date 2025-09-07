package com.example;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        System.out.println("Ejercicio 6");
        // tu código aquí
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su estatura: ");
        double estatura = scanner.nextDouble();

        System.out.println("su nombre es: " + nombre);
        System.out.println("su edad es: " + edad + " años");
        System.out.println("su estatura es: " + estatura);

        scanner.close();

    }
}
