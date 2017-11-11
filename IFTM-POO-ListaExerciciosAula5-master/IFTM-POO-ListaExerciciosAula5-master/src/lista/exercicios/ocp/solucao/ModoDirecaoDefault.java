package lista.exercicios.ocp.solucao;

public class ModoDirecaoDefault implements ModoDeDirecao {
	
	private Veiculo veiculo;
	
	@Override
	public Veiculo modoDirecao() {
		this.veiculo = new Veiculo(400, 20);
		return veiculo;
	}
}
