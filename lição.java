
package com.mycompany.calcularretangulo;

import java.util.Scanner;

public class lição {
        public static void main(String[] args) {
                Scanner scanner = new 
            Scanner(System.in);
                int numero2;
                System.out.println("fale dois números para efetuar a divisão: ");
                int numero1 = scanner.nextInt ();
                
                while (true){
                    System.out.println("fale o divisor: ");
                numero2 = scanner.nextInt ();
                
                if (numero2 == 0){
                    System.out.println("escolha outro numero que nao seja 0. ");
                    }
                else{break;}
                }
                double divisao = (double) numero1 / numero2;
                System.out.println (numero1 + " dividido por " + numero2 + " e igual a: " + divisao);

       

                


                
    }
}

