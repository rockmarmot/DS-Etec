/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.litro_gasolina_alcool;
import java.util.Scanner;
/**
 *
 * @author Renato
 */
public class Litro_gasolina_alcool {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        final double precoGasolina = 3.30;
        final double precoAlcool = 2.90;

        System.out.print("Digite o tipo de combustível (A para Álcool, G para Gasolina): ");
        char tipo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de litros: ");
        double litros = scanner.nextDouble();

        double precoLitro = 0;
        double descontoPorcentagem = 0;

        if (tipo == 'A') {
            precoLitro = precoAlcool;
            descontoPorcentagem = (litros <= 20) ? 0.03 : 0.05;
        } else if (tipo == 'G') {
            precoLitro = precoGasolina;
            descontoPorcentagem = (litros <= 20) ? 0.04 : 0.06;
        } else {
            System.out.println("Tipo de combustível inválido.");
            return;
        }

        double totalSemDesconto = litros * precoLitro;
        double desconto = totalSemDesconto * descontoPorcentagem;
        double valorFinal = totalSemDesconto - desconto;

        System.out.printf("Valor a ser pago: R$ %.2f%n", valorFinal);
    }
}
