/*
 * . Sistema de Login: Desenvolva um programa que simule um sistema de login simples. O
    programa deve solicitar o nome de usuário e senha, e permitir até 3 tentativas. Utilize
    WHILE para controlar o número de tentativas e IF-ELSE para verificar a autenticidade dos
    dados.
 */

package com.mycompany.projeto_4_valentin;

import java.util.Scanner;

public class PROJETO_4_VALENTIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String usuarioCorreto = "usuario";
        String senhaCorreta = "senha";
        
        int c = 3;
        
        while (c > 0) {
            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();
            
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            
            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido!");
                break;
                
            } else {
                c--;
                System.out.println("Nome de usuário ou senha incorretos. Tentativas restantes: " + c);
            }
            
            if (c == 0) {
                System.out.println("Número máximo de tentativas alcançado. Acesso bloqueado.");
            }
        }
    }
}

