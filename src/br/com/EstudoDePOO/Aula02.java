package br.com.EstudoDePOO;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.rabiscar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "Tinteira";
        c2.cor = "Vermelha";
        c2.ponta = 1f;
        c2.tampar();
        c2.rabiscar();
        c2.status();
    }
}
