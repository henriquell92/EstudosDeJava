package br.com.henrique.EstudoBanco;

class Conta {
    int numero;
    String titular;
    double saldo;

    boolean saca(double valor){
        if(this.saldo < valor) {
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void deposita(double quantidade){
        this.saldo += quantidade;
    }

    boolean transfere(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if (retirou == false){
            //não deu para sacar
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }
}