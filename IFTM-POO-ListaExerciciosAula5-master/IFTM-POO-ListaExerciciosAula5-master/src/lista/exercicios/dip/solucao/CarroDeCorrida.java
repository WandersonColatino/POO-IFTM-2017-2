package lista.exercicios.dip.solucao;

public class CarroDeCorrida implements Carro {

	private final int capacidadeTanqueCombustivel;
	private int quantidadeCombustivel;
	private int potencia;

	public CarroDeCorrida(final int combustivel) {
		this.capacidadeTanqueCombustivel = combustivel;
		this.quantidadeCombustivel = combustivel;
	}

	public void acelerar() {
		potencia++;
		quantidadeCombustivel--;
	}

	public int getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}

	public int getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public int getPotencia() {
		return potencia;
	}

}