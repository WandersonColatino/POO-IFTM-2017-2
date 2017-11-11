package lista.exercicios.srp.violation;

public class Teste {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo(45);
		System.out.println(veiculo.getQuantidadeCombustivel());
		System.out.println(veiculo.getCapacidadeTanqueCombustivel());

		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		System.out.println(veiculo.getQuantidadeCombustivel());

		Reabastecimento reabastecimento = new Reabastecimento();
		reabastecimento.reabastecer(veiculo);
		System.out.println(veiculo.getQuantidadeCombustivel());
	}

}
