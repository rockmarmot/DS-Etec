package com.mycompany.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos termos da sequência de Fibonacci você quer ver? ");
        int n = scanner.nextInt();

        int a = 1, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
