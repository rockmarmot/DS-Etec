
package com.mycompany.moeda;

import java.util.Scanner;


public class Moeda {

        public static void main(String[] args) {
      Scanner scanner = new
                Scanner(System.in);
        System.out.println("Escreva o valor em reais: ");
      double numero1 = scanner.nextInt();
      double dolar = 5.36;
      double euro = 6.18;
      double dolar2 = numero1 / dolar;
      double euro2 = numero1 / euro;
      
            System.out.println("Qual moeda voce quer converter? dolar = 1    euro= 2");
            int moeda = scanner.nextInt();
            if (moeda == 1){
                System.out.println(dolar2 + " " + "USD");
            } else if (moeda == 2) {
                System.out.println(euro2 + " " + "EUR");
            }
            
    
        
    }
}
