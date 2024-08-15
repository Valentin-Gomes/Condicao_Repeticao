/*
   Sistema de Aprovação de Alunos: Crie um programa que receba as notas de um aluno em
   três disciplinas e calcule sua média. Utilize estruturas IF e ELSE para determinar se o aluno
   foi aprovado, reprovado ou está em recuperação com base na média (Aprovado: média ≥ 7,
   Recuperação: 5 ≤ média < 7, Reprovado: média < 5).
 */

package com.mycompany.projeto_1_valentin;

import java.util.Scanner;
public class PROJETO_1_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float media;
        
        System.out.println("Digite suas 3 notas para calcular a média");
        System.out.print("Digite a primeira nota: ");
        int notaUm = ler.nextInt();
        
        System.out.print("Digite a segunda nota: ");
        int notaDois = ler.nextInt();
        
        System.out.print("Digite a terceira nota: ");
        int notaTres = ler.nextInt();
        
        media = (notaUm + notaDois + notaTres) / 3;
        
        System.out.println("A média foi de " +media);
        
        if (media >= 7){
            System.out.println("APROVADO!");
        }
        else if (media < 7 && media >=5){
            System.out.println("RECUPERAÇÃO");
        }
        else{
            System.out.println("REPROVADO");
        }
        
    }
}
