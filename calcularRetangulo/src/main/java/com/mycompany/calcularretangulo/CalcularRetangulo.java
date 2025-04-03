
package com.mycompany.calcularretangulo;

import java.util.Scanner;

public class CalcularRetangulo {

    public static void main(String[] args) {
                Scanner scanner = new 
            Scanner(System.in);
        System.out.println("vamos calcular um retangulo, fale as duas medidas dele:");
        int lado1 = scanner.nextInt();
        int lado2 = scanner.nextInt();
        
        int multiplicacao = lado1 * lado2;
        System.out.println("O retangulo tem area de: " + multiplicacao);
    }
}
