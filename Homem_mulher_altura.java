/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homem_mulher_altura;
import java.util.Scanner;
/**
 *
 * @author Renato
 */
public class Homem_mulher_altura {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Sexo (M ou F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido! Use M ou F.");
            return;
        }

        System.out.printf("Olá, %s! Seu peso ideal é: %.2f kg%n", nome, pesoIdeal);

    }
}
