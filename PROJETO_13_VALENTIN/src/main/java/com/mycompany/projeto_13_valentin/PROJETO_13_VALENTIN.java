/*
 * Verificação de Ano Bissexto: Crie um programa que solicite ao usuário um ano e utilize
    IF-ELSE para verificar se ele é bissexto. O programa deve seguir as regras de divisibilidade
    para determinar o resultado.
 */

package com.mycompany.projeto_13_valentin;


import java.util.Scanner;

public class PROJETO_13_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um ano para saber se é bissexto: ");
        int ano = ler.nextInt();
        
        if (ano % 4 == 0){
            System.out.println("O ano é bissexto");
        }
        else{
            System.out.println("O ano não é bissexto");
        }
        
    }
}
