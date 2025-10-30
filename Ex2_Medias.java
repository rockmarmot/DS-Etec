/*
 * Exercício 2 - Média Aritmética
 * Calcula a média de dois grupos de números e depois a média geral.
 */

public class Ex2_Medias {
    public static void main(String[] args) {
        double media1 = (8 + 7) / 2.0;
        double media2 = (4 + 5 + 6) / 3.0;
        double mediaGeral = (media1 + media2) / 2.0;

        System.out.println("Média 1: " + media1);
        System.out.println("Média 2: " + media2);
        System.out.println("Média geral: " + mediaGeral);
    }
}
