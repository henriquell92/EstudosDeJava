package br.com.henrique;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Seja Bem-vindo, qual o seu nome?");
        String nomeCompleto = scan.nextLine();
        System.out.println("Olá " + nomeCompleto);

        System.out.println("Quantos anos você tem?");
        int idade = scan.nextInt();
        System.out.println("Você tem " + idade + " anos");
        idade++;
        System.out.println("Ano que vem você terá: " + idade + " anos");

    }
}

