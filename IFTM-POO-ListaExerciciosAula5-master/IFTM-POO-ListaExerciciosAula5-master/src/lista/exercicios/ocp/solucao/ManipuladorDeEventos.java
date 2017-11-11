package lista.exercicios.ocp.solucao;

public class ManipuladorDeEventos {

	private Veiculo veiculo;
		
	public ManipuladorDeEventos(ModoDeDirecao modo) {
		this.veiculo = modo.modoDirecao();
	}
		
	public Veiculo getVeiculo() {
		return veiculo;
	}

	
}
