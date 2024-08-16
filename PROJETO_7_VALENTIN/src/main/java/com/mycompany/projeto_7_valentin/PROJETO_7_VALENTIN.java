/*
 *  Contagem de Números Pares e Ímpares: Crie um programa que solicite ao usuário um
    número e utilize um laço FOR para percorrer todos os números de 1 até o número inserido.
    O programa deve contar e exibir a quantidade de números pares e ímpares.

 */

package com.mycompany.projeto_7_valentin;

import java.util.Scanner;

public class PROJETO_7_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int par = 0;
        int impar = 0;
        
        System.out.print("Digite um número para contar o pares e ímpares de 1 até o número escolhido: ");
        int num = ler.nextInt();
        
        for(int c = 1;c <= num; c++){
            if (c % 2 == 0){
                par++;
            }
            else{
                impar++;
            }
        }
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);
    }
}
