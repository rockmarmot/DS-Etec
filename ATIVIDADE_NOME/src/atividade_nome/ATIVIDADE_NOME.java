
package atividade_nome;
import java.util.Scanner;

public class ATIVIDADE_NOME {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Insira sua cidade: ");
        String cidade = entrada.nextLine();
        System.out.println("insira sua idade: ");
        int idade = entrada.nextInt();

        System.out.println(nome + ' ' + cidade + ' ' + idade);
       
        
        
        System.out.println("coloque um numero: "); 
        int numero1 = entrada.nextInt();
        System.out.println("coloque outro numero: "); 
        int numero2 = entrada.nextInt();
        
        int soma = numero1 + numero2;
        System.out.println("sua soma e " + soma);
        
        System.out.println("Quantos graus Celsius está fazendo agora? ");
        double celsius = entrada.nextInt();
        
        double conta = (celsius * 9/5) + 32;
        
        System.out.println("seu grau celsius em fahrenheit é: " + conta);
        
       
    }
    
}
