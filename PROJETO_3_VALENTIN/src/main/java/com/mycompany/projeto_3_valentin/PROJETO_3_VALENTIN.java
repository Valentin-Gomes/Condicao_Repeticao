/*
 *  Calculadora Simples: Crie uma calculadora que permita ao usuário escolher entre as
    operações básicas (adição, subtração, multiplicação e divisão). Utilize IF-ELSE para
    determinar a operação escolhida e execute-a com base nos números inseridos pelo usuário.
 */

package com.mycompany.projeto_3_valentin;


import java.util.Scanner;

public class PROJETO_3_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int operacao = 0;
        float resultado;
        
        while (operacao < 1 || operacao > 4){
            System.out.print("Escolha uma operação para calcular (1= Adição, 2= Substração. 3= Multiplicação. 4= Divisão): ");
            operacao = ler.nextInt();
        
        
            if (operacao == 1){
                System.out.print("Digite dois valores para somar: ");
                int numUm = ler.nextInt();
                int numDois = ler.nextInt();

                resultado = numUm + numDois;

                System.out.println("O resultado foi de " + resultado);
            }
            else if (operacao == 2){
                System.out.print("Digite dois valores para subtrair: ");
                int numUm = ler.nextInt();
                int numDois = ler.nextInt();

                resultado = numUm - numDois;

                System.out.println("O resultado foi de " + resultado);
            }
            else if (operacao == 3){
                System.out.print("Digite dois valores para multiplicar: ");
                int numUm = ler.nextInt();
                int numDois = ler.nextInt();

                resultado = numUm * numDois;

                System.out.println("O resultado foi de " + resultado);
            }
            else if (operacao == 4){
                System.out.print("Digite dois valores para dividir: ");
                int numUm = ler.nextInt();
                int numDois = ler.nextInt();

                resultado = numUm / numDois;

                System.out.println("O resultado foi de " + resultado);
            }
            
            if(operacao < 1 || operacao > 4){
                System.out.println("Digite uma operção válida!");
            }
        }
            
    }
}
