/*
 * Exercício 6 - Antecessor e Sucessor
 * Lê um número inteiro e mostra seu antecessor e sucessor.
 */

import java.util.Scanner;

public class Ex6_AntecessorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        sc.close();
    }
}
