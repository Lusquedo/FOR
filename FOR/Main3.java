/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio;

/**
 *
 * @author Admin
 */

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        
        System.out.println("Tabela de quadrados de 1 até " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            int quadrado = i * i; 
            System.out.println(i + "² = " + quadrado);
        }
        
        
        scanner.close();
    }
}
