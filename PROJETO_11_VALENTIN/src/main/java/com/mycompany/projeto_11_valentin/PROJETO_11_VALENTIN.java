/*
 * Conversor de Temperatura: Crie um programa que converta uma temperatura de
    Celsius para Fahrenheit e vice-versa. O programa deve solicitar ao usuário a temperatura e
    a unidade de origem, e utilizar IF-ELSE para realizar a conversão correta.

 */

package com.mycompany.projeto_11_valentin;

import java.util.Scanner;

public class PROJETO_11_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int unidade = 0;
        float temperaturaConv;
        
        while(unidade != 1 && unidade != 2){
            System.out.print("Escolha a unidade de temperatura (1- Celsius e 2- Fahrenheit): ");
            unidade = ler.nextInt();
            
            if(unidade != 1 && unidade != 2){
                System.out.println("Escolha uma opção válida!");
            }
        }
        
        System.out.print("Digite a temperatura: ");
        float temperatura = ler.nextFloat();
        
        if(unidade == 1){
            temperaturaConv = (float) ((1.8 * temperatura) + 32);
            System.out.println("Temperatura convertida para Fahrenheit: "+ temperaturaConv);
        }
        else{
            temperaturaConv = (float) ((temperatura - 32)/1.8);
            System.out.println("Temperatura convertida para Celsius: "+ temperaturaConv);
        }
        
        
    }
}
