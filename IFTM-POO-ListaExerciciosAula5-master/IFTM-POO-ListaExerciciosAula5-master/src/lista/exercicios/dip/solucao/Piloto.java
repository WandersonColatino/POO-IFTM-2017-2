package lista.exercicios.dip.solucao;

public class Piloto {

	private Carro carro;

	public Piloto(Carro carro) {
		this.carro = carro;
	}

	public void aumentaVelocidade() {
		carro.acelerar();
	}
}
