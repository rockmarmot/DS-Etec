/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salario;
import java.util.Scanner;
/**
 *
 * @author Renato
 */
public class SALARIO {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Salário fixo: R$ ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Total de vendas no mês: R$ ");
        double vendas = scanner.nextDouble();

        double comissao = vendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("\nRelatório:");
        System.out.println("Vendedor: " + nome);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Comissão (15%): R$ " + comissao);
        System.out.println("Salário final com comissão: R$ " + salarioFinal);
    }
}
