/*
 * Tabuada Personalizada: Crie um programa que solicite ao usuário um número e gere a
    tabuada desse número de 1 a 10 utilizando um laço FOR. O programa deve exibir o
    resultado de cada multiplicação.
 */

package com.mycompany.projeto_5_valentin;


import java.util.Scanner;

public class PROJETO_5_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int resultado;
        
        System.out.print("Digite um número para gerar a tabuada dele: ");
        int num = ler.nextInt();
        
        for(int c = 1; c <= 10;c++){
            resultado = num * c;
            System.out.println(resultado);
        }
        
    }
}
