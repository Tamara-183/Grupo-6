/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grupo_6;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class Grupo_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Convertir el número a su valor absoluto para manejar números negativos
        int numeroAbsoluto = Math.abs(numero);

        // Determinar la cantidad de dígitos convirtiendo el número a String
        int cantidadDigitos = String.valueOf(numeroAbsoluto).length();

        // Mostrar el resultado
        System.out.println("El número tiene " + cantidadDigitos + " dígitos.");
    }
}
