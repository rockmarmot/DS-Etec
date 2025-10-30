/*
 * Exercício 1 - Idade em Dias
 * Lê a idade de uma pessoa em anos, meses e dias e mostra a idade expressa em dias.
 * 1 ano = 365 dias | 1 mês = 30 dias
 */

import java.util.Scanner;

public class Ex1_IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Anos: ");
        int anos = sc.nextInt();

        System.out.print("Meses: ");
        int meses = sc.nextInt();

        System.out.print("Dias: ");
        int dias = sc.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("Idade em dias: " + totalDias);

        sc.close();
    }
}
