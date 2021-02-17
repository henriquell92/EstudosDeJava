package br.com.EstudoDeVariaveis;

import java.util.Scanner;

public class TestandoIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();
        boolean amigoDoDono = false;

        if (idade < 18 && !amigoDoDono) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode Entrar");
        }
    }
}
