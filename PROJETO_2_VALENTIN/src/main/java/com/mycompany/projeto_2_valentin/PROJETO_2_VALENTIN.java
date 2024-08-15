/*
 *. Jogo de Adivinhação: Desenvolva um programa em que o computador escolhe um número
    aleatório entre 1 e 100, e o usuário tem que adivinhar. Utilize um laço WHILE para permitir
    múltiplas tentativas até que o usuário acerte, e IF-ELSE para fornecer dicas (se o número é
    maior ou menor).
 */

package com.mycompany.projeto_2_valentin;

import java.util.Random;
import java.util.Scanner;

public class PROJETO_2_VALENTIN {

    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);
        
        int numGerado = (gerador.nextInt(100)+1);
        
        
        System.out.print("O computador irá gerar um número de 1 a 100, tente advinhar: ");
        int numUsuario = ler.nextInt();
        
        while (numUsuario != numGerado){
           
            if(numUsuario > numGerado){
                System.out.print("Número errado, tente novamente (dica, é menor): ");
                numUsuario = ler.nextInt();
            }
            else{
                System.out.print("Número errado, tente novamente (dica, é maior)");
                numUsuario = ler.nextInt();
            }               
        }
        
        System.out.print("Boa, acertou o número: " + numGerado);
    }
}
