/*
 * Exercício 4 - Cálculo de IPI
 * Lê informações de duas peças e aplica o percentual de IPI.
 */

import java.util.Scanner;

public class Ex4_CalculoIPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Percentual de IPI: ");
        double ipi = sc.nextDouble();

        System.out.print("Código da peça 1: ");
        int cod1 = sc.nextInt();
        System.out.print("Valor unitário da peça 1: ");
        double valor1 = sc.nextDouble();
        System.out.print("Quantidade da peça 1: ");
        int quant1 = sc.nextInt();

        System.out.print("Código da peça 2: ");
        int cod2 = sc.nextInt();
        System.out.print("Valor unitário da peça 2: ");
        double valor2 = sc.nextDouble();
        System.out.print("Quantidade da peça 2: ");
        int quant2 = sc.nextInt();

        double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        System.out.printf("Valor total a pagar: R$ %.2f%n", total);

        sc.close();
    }
}
