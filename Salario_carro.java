/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salario_carro;
import java.util.Scanner;
/**
 *
 * @author Renato
 */
public class Salario_carro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário fixo: R$ ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Valor por carro vendido (comissão fixa): R$ ");
        double valorPorCarro = scanner.nextDouble();

        System.out.print("Valor total das vendas: R$ ");
        double totalVendas = scanner.nextDouble();

        double comissaoFixa = carrosVendidos * valorPorCarro;
        double comissaoPercentual = totalVendas * 0.05;

        double salarioFinal = salarioFixo + comissaoFixa + comissaoPercentual;

        System.out.println("Salário final do vendedor: R$ " + salarioFinal);
    }
}
