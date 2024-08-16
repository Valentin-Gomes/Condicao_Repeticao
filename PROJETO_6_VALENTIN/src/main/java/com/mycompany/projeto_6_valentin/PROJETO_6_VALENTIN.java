/*
 *  Cálculo de IMC: Desenvolva um programa que calcule o Índice de Massa Corporal (IMC)
    de uma pessoa. O programa deve solicitar o peso e a altura do usuário, calcular o IMC e usar
    IF-ELSE para classificar o resultado (baixo peso, peso normal, sobrepeso, obesidade).
 */

package com.mycompany.projeto_6_valentin;


import java.util.Scanner;

public class PROJETO_6_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float imc;
        
        System.out.print("Digite seu peso: ");
        int peso = ler.nextInt();
        
        System.out.print("Digite seu altura: ");
        float altura = ler.nextFloat();
        
        imc = peso/(altura*altura);
        
        System.out.println("Seu IMC é de "+imc);
        
        if(imc < 18.5){
            System.out.println("Magreza");
        }
        else if(imc >= 18.5 && imc <=24.9){
            System.out.println("Normal");
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }
        else if(imc >=30 && imc <=39.9){
            System.out.println("Obesidade");
        }
        else{
            System.out.println("Obesidade Grave");
        }
        
    }
}
