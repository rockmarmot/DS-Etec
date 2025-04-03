package com.mycompany.operacoes_comdoisnumeros;

import java.util.Scanner;


public class Operacoes_comDOISnumeros {

    public static void main(String[] args) {
      Scanner scanner = new
                Scanner(System.in);
        System.out.println("fale o primeiro numero: ");
      int numero1 = scanner.nextInt();
              System.out.println("fale o segundo numero: ");
      int numero2 = scanner.nextInt();
      
      
      int soma = numero1 + numero2;
      int subtracao = numero1 - numero2;
      int multiplicacao = numero1 * numero2;
      double divisao = (double) numero1 / numero2;
      
        System.out.println("soma: " + soma);
        System.out.println("subtracao: " + subtracao);
        System.out.println("multiplicacao: " + multiplicacao);
        System.out.println("divisao: " + divisao);
        
    }
}
