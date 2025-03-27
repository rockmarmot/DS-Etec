/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package média.de.alunos;

import java.util.Scanner;

public class MédiaDeAlunos {
    
  public static void main(String[] args) {
      Scanner scanner = new
                Scanner(System.in);
     int quantidade = 0;
      double soma = 0;
      double nota;
      System.out.println("digite um numero negativo quando quiser parar o loop");
        
        while (true) {
            System.out.println("NOTA" + (quantidade + 1) + ": ");
            nota = scanner.nextDouble();
            
            if (nota < 0) {
                break;
            }
            quantidade++;
            soma+=nota;
                     
        }
        
        double media = soma / quantidade;
            System.out.println(media);
  
        
    }
    
}
