/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caminhao;
import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class CAMINHAO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância total percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        double combustivel = scanner.nextDouble();

        if (combustivel == 0) {
            System.out.println("Não é possível dividir por zero (combustível não pode ser zero).");
        } else {
            double consumoMedio = distancia / combustivel;
            System.out.println("O consumo médio do automóvel é: " + consumoMedio + " km/l");
        }
    }
}
