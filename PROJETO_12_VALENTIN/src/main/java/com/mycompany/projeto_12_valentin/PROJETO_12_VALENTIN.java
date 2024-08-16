/*
 *  Sistema de Votação: Desenvolva um programa que permita ao usuário votar em 3
    candidatos diferentes. O programa deve utilizar um laço FOR para permitir a votação de
    vários eleitores e, ao final, exibir o total de votos de cada candidato e o vencedor.
 */

package com.mycompany.projeto_12_valentin;


import java.util.Scanner;

public class PROJETO_12_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int candUm = 0;
        int candDois = 0;
        int candTres = 0;
        int candQuatro = 0;
        int candCinco = 0;
        int votoUm = 0;
        int votoDois = 0;
        int votoTres = 0;
        
        System.out.println("Tecle 1 para Candidato 1");
        System.out.println("Tecle 2 para Candidato 2");
        System.out.println("Tecle 3 para Candidato 3");
        System.out.println("Tecle 4 para Candidato 4");
        System.out.println("Tecle 5 para Candidato 5");
        
        
        for(int c = 0; c < 5; c++){
            while(votoUm < 1 || votoUm >5 || votoDois < 1 || votoDois >5 || votoTres < 1 || votoTres > 5 || votoUm == votoDois || votoDois == votoTres || votoUm == votoTres){
                System.out.print("Vote no primeiro candidato: ");
                votoUm = ler.nextInt();

                System.out.print("Vote no segundo candidato: ");
                votoDois = ler.nextInt();

                System.out.print("Vote no terceiro candidato: ");
                votoTres = ler.nextInt();
                
                if (votoUm < 1 || votoUm >5 && votoDois < 1 || votoDois >5 || votoTres < 1 || votoTres > 5){
                    System.out.println("Voto incorreto!");
                }
                if(votoUm == votoDois || votoDois == votoTres || votoUm == votoTres){
                    System.out.println("Não vote repetido!");
                }                 
            }
            
            if (votoUm == 1 || votoDois == 1 || votoTres == 1){
                candUm++;
            }
            if (votoUm == 2 || votoDois == 2 || votoTres == 2){
                candDois++;
            }
            if (votoUm == 3 || votoDois == 3 || votoTres == 3){
                candTres++;
            }
            if (votoUm == 4 || votoDois == 4 || votoTres == 4){
                candQuatro++;
            }
            if (votoUm == 5 || votoDois == 5 || votoTres == 5){
                candCinco++;
            }
            
            votoUm = 0;
            votoDois = 0;
            votoTres = 0;
            System.out.println("PIRILILILI Sucuesso");
        }
        
        System.out.println("Candidato 1 teve " + candUm +" Votos");
        System.out.println("Candidato 2 teve " + candDois +" Votos");
        System.out.println("Candidato 3 teve " + candTres +" Votos");
        System.out.println("Candidato 4 teve " + candQuatro +" Votos");
        System.out.println("Candidato 5 teve " + candCinco +" Votos");
        
        if(candUm == candDois && candDois == candTres && candTres == candQuatro && candQuatro == candCinco){
            System.out.println("Empate");
        }
        else if(candUm > candDois && candUm > candTres && candUm > candQuatro && candUm > candCinco){
            System.out.println("Candidato 1 venceu!");
        }
        else if(candDois > candUm && candDois > candTres && candDois > candQuatro && candUm > candCinco){
            System.out.println("Candidato 2 venceu!");
        }
        else if(candTres > candDois && candTres > candUm && candTres > candQuatro && candUm > candCinco){
            System.out.println("Candidato 3 venceu!");
        }
        else if(candQuatro > candUm && candQuatro > candDois && candQuatro > candTres && candQuatro > candCinco){
            System.out.println("Candidato 4 venceu!");
        }
        else if(candCinco > candUm && candCinco > candDois && candCinco > candTres && candCinco > candQuatro){
            System.out.println("Candidato 5 venceu!");
        }
        
        
        
    }
}
