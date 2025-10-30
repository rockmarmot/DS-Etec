/*
 * Exercício 3 - Reajuste Salarial
 * Lê um salário e mostra o valor com reajuste de 1%.
 */

import java.util.Scanner;

public class Ex3_ReajusteSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = sc.nextDouble();

        double novoSalario = salario * 1.01;

        System.out.printf("Salário com reajuste de 1%%: R$ %.2f%n", novoSalario);

        sc.close();
    }
}
