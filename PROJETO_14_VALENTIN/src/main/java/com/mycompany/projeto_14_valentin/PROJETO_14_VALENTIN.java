/*
 * Jogo do Par ou Ímpar: Desenvolva um jogo em que o usuário escolhe um número e o
    programa sorteia outro número aleatório. Utilize IF-ELSE para determinar se a soma dos
    dois números é par ou ímpar, e declare o vencedor com base na escolha do usuário.
 */

package com.mycompany.projeto_14_valentin;

import java.util.Scanner;
import java.util.Random;

public class PROJETO_14_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Digite número par ajogar com a máquina ");
        int num = ler.nextInt();
        
        int numRandon = rand.nextInt(num);
        
        int soma = num + numRandon;
        
        if(soma % 2 ==0){
            System.out.print("Número par ");
            if(num % 2 ==0 && numRandon ==0){
                System.out.print("Empate");
            }
            else if(num % 2 == 0 && numRandon % 2 !=0){
                System.out.print("Usuário ganhou");
            }
            else{
                System.out.print("Máquina ganhou");
            }
        }
        else{
            System.out.print("Número ímpar ");
            if(num % 2 !=0 && numRandon !=0){
                System.out.print("Empate");
            }
            else if(num % 2 != 0 && numRandon % 2 ==0){
                System.out.print("Usuário ganhou");
            }
            else{
                System.out.print("Máquina ganhou");
            }
        }
        
    }
}
