/*
 * Exercício 5 - Cálculo de Salários Mínimos
 * Lê o valor do salário mínimo e o salário de um usuário e mostra quantos salários mínimos ele ganha.
 */

import java.util.Scanner;

public class Ex5_SalariosMinimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salMin = sc.nextDouble();

        System.out.print("Digite o salário do usuário: ");
        double salUsuario = sc.nextDouble();

        double qtdSalarios = salUsuario / salMin;

        System.out.printf("O usuário ganha %.2f salários mínimos.%n", qtdSalarios);

        sc.close();
    }
}
