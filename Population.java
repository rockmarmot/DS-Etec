/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.population;

/**
 *
 * @author Renato
 */
public class Population {

    public static void main(String[] args) {
              int populacaoA = 80000;
        int populacaoB = 200000;
        double taxaA = 0.03;
        double taxaB = 0.015;
        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para a população do país A ultrapassar ou igualar a do país B.");
    }
}
