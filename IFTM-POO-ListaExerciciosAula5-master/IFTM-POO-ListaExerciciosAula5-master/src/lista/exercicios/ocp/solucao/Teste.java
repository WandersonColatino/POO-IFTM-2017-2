package lista.exercicios.ocp.solucao;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("****** DEFAULT ****** ");
		ManipuladorDeEventos manipulador = new ManipuladorDeEventos(new ModoDirecaoDefault());
		Veiculo veiculo = manipulador.getVeiculo();
		System.out.println("Potência: " + veiculo.getPotencia());
		System.out.println("Altura da Suspenção: " + veiculo.getAlturaSuspencao());
		System.out.println("");

		System.out.println("****** ESPORTE ****** ");
		manipulador = new ManipuladorDeEventos(new ModoDirecaoEsporte());
		veiculo = manipulador.getVeiculo();
		System.out.println("Potência: " + veiculo.getPotencia());
		System.out.println("Altura da Suspenção: " + veiculo.getAlturaSuspencao());
		System.out.println("");

		System.out.println("****** PASSEIO ****** ");
		manipulador = new ManipuladorDeEventos(new ModoDirecaoPasseio());
		veiculo = manipulador.getVeiculo();
		System.out.println("Potência: " + veiculo.getPotencia());
		System.out.println("Altura da Suspenção: " + veiculo.getAlturaSuspencao());

	}

}
