package br.com.henrique.EstudoBanco;

public class ContaBanco {


    public static void main(String[] args){

        // Aqui criamos a conta
        Conta minhaConta;
        minhaConta = new Conta();

       minhaConta.saldo = 1000;
       if (minhaConta.saca(2000)) {
           System.out.println("Consegui Sacar");
       } else {
           System.out.println("Não consegui sacar");
       }

    }

}

