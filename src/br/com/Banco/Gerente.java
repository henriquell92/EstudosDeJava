package br.com.Banco;

public class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    @Override
    public double getBonificacao() {
        return this.salario*0.15;
    }

    public static class Main{
        public static void main(String[] args) {
            Gerente gerente = new Gerente();
            gerente.getSalario(5000.0);
            System.out.println(gerente.getBonificacao());
        }
    }
}
