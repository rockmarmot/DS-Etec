
package com.mycompany.exercicio_genes;

import java.util.Scanner;

public class Exercicio_genes {

    public static void main(String[] args) {
                Scanner scanner = new 
            Scanner(System.in);
                int quantidade = 1;
                int quantidade_de_genes = 0;
                
                System.out.println("Digite seu arranjo: ");
                int arranjo = scanner.nextInt();
                
                System.out.println("Digite seu gene: ");
                int gene = scanner.nextInt();
                
        
            while (true){
                System.out.println("Digite " + (arranjo) + " Genes:  ");
            int gene_final = scanner.nextInt();
            
            if (quantidade == arranjo){
            break;
            }
            
            if (gene == gene_final){
            quantidade_de_genes++;
            }
            
            quantidade++;
            }
            
            if (quantidade_de_genes >= 2){
                System.out.println("Achei");
            }
            else if (quantidade_de_genes == 1){
                System.out.println("insuficiente");
            }
            else {
                System.out.println("Nao achei");
            }
             
        
        

        }
       }
    

