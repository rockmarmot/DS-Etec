/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada_8;

/**
 *
 * @author Renato
 */
public class Tabuada_8 {

    public static void main(String[] args) {
      int numero = 8;

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
