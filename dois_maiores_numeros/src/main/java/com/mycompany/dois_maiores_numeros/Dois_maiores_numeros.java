package com.mycompany.dois_maiores_numeros;

import java.util.Scanner;
public class Dois_maiores_numeros {

 public static void main(String[] args) {
        Scanner scanner = new 
            Scanner(System.in);
             int quantidade = 1;
             int maior = Integer .MIN_VALUE;
             int segundo_maior = Integer .MIN_VALUE;
      System.out.println("digite 10 numeros ");
        
        while (true) {
            System.out.println("numero " + (quantidade) + ": ");
            int numero = scanner.nextInt();
            
            if (numero > maior){
            segundo_maior = maior;
            maior = numero;
            }            else if (numero > segundo_maior){
                    segundo_maior = numero;
                    }
            
            if (quantidade == 10) {
                break;
            }
            quantidade++;

            
                     
        }
                    System.out.println("Seu maior numero foi: " + maior);
                    System.out.println("Seu segundo maior numero foi: " + segundo_maior);

    }
    
}

