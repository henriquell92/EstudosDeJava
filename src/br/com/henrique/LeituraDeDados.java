package br.com.henrique;


import java.util.Scanner;

public class LeituraDeDados {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seja Bem-Vindo " + nomeCompleto + "!");

        System.out.println("Qual a sua idade?");
        int idade = scan.nextInt();
        System.out.println("Você tem: " + idade + " anos");

        System.out.println("Qual a sua altura");
        double altura = scan.nextInt();
        System.out.println("Você tem: " + altura + " metros");
    }
}