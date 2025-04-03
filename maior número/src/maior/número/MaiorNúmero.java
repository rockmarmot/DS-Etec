package maior.número;

import java.util.Scanner;
public class MaiorNúmero {

    
 
    public static void main(String[] args) {
        Scanner scanner = new 
            Scanner(System.in);
             int quantidade = 1;
             int maior = Integer .MIN_VALUE;
      System.out.println("digite 10 numeros ");
        
        while (true) {
            System.out.println("numero " + (quantidade) + ": ");
            int numero = scanner.nextInt();
            
            if (numero > maior){
            maior = numero;
            }
            
            if (quantidade == 10) {
                break;
            }
            quantidade++;
            
                     
        }
                    System.out.println("Seu maior numero foi: " + maior);

    }
    
}
