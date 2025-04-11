/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idade;
import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class Idade {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos anos de idade? ");
        int anos = scanner.nextInt();

        System.out.print("Quantos meses? ");
        int meses = scanner.nextInt();

        System.out.print("Quantos dias? ");
        int dias = scanner.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Idade total em dias: " + totalDias);
    }
}
