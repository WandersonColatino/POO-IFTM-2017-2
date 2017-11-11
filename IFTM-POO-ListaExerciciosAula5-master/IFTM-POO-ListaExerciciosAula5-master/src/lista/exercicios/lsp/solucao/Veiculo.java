package lista.exercicios.lsp.solucao;

public class Veiculo {

    private Marcha marcha;

    public Marcha getMarcha() {
        return marcha;
    }

    public void mudaMarcha(final Marcha marcha) {
        this.marcha = marcha;
    }

}