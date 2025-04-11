/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.n_1;

import java.util.Scanner;
public class N_1 {

    public static void main(String[] args) {
        Scanner scanner = new 
        Scanner(System.in);

        System.out.print("Digite um número maior que zero: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
