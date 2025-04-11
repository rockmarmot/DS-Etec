/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.preco_gasosa;
import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class Preco_gasosa {

    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

        System.out.print("Distância (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Consumo (km por litro): ");
        double consumo = scanner.nextDouble();

        System.out.print("Preço do litro de combustível: ");
        double preco = scanner.nextDouble();

        double custo = (distancia / consumo) * preco;

        System.out.println("Custo estimado da viagem: R$ " + custo);
    }
}
