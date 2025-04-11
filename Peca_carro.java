/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peca_carro;
import java.util.Scanner;
/**
 *
 * @author Renato
 */
public class Peca_carro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = scanner.nextDouble();

        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double custoFinal = custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * percentualImpostos);

        System.out.println("Custo final ao consumidor: R$ " + custoFinal);
    }
}
