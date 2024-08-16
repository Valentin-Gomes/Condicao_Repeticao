/*
 *  Verificação de Números Primos: Crie um programa que solicite ao usuário um número e
    utilize um laço FOR para verificar se o número é primo. Utilize IF para determinar se ele é
    divisível por outros números além de 1 e ele mesmo
 */

package com.mycompany.projeto_9_valentin;


import java.util.Scanner;

public class PROJETO_9_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número para saber se é primo ou não: ");
        int num = ler.nextInt();
        
        if (num >=1 && num <=3){
            System.out.println("O número é primo");
        }
        else{
            for(int c = 4; c <= num; c++ ){
                if(num % c == 0){
                    System.out.println("O número não é primo");
                    break;
                }
            }
       
        }    

    }
}
    
