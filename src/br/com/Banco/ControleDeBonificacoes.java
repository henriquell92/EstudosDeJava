package br.com.Banco;

public class ControleDeBonificacoes {
    private double totalDeBeneficios = 0;

    public void registra (Funcionario funcionario){
        this.totalDeBeneficios += funcionario.getBonificacao();
    }

    public double getTotalDeBeneficios(){
        return this.totalDeBeneficios;
    }
}


