/*
 * Sistema de Senha: Desenvolva um programa que solicite ao usuário uma senha e utilize
    IF-ELSE para verificar se ela atende aos critérios de segurança (mínimo de 8 caracteres). O
    programa deve permitir ao usuário tentar novamente até que uma senha válida seja
    inserida.

 */

package com.mycompany.projeto_8_valentin;


import java.util.Scanner;

public class PROJETO_8_VALENTIN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        
         while (true) {
            System.out.print("Digite uma senha (mínimo 8 caracteres): ");
            senha = scanner.nextLine();

            if (senha.length() >= 8) {
                System.out.println("Senha válida!");
                break;              
            } 
            else {
                System.out.println("Senha inválida! Tente novamente.");
            }
        }
        
    }
}
