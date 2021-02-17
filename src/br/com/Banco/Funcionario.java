package br.com.Banco;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public double getBonificacao(){
        return this.salario * 0.10;
    }

    public void getSalario(double salario){
        this.salario = salario;
    }
}
