package lista.exercicios.lsp.solucao;

public class Aviao {

	private Veiculo veiculo;

	public Aviao() {
		this.veiculo = new Veiculo();
	}

	public void mudaMarcha(Marcha marcha) {
		this.veiculo.mudaMarcha(marcha);
	}

	public Marcha getMarcha() {
		return this.veiculo.getMarcha();
	}
}
