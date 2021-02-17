package br.com.EstudoDeVariaveis;

public class TestandoFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i = ++i){
            System.out.println(i);
        }
    }
}
