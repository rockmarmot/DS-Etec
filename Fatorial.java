/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatorial;

import java.util.Scanner;
public class Fatorial {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = 1;

        System.out.print(numero + "! = ");

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }

        System.out.println(" = " + fatorial);
 
    }
}
