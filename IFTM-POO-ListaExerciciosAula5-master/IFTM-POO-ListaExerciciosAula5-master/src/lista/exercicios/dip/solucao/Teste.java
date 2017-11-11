package lista.exercicios.dip.solucao;

public class Teste {

	public static void main(String[] args) {
		Carro carro = new CarroDeCorrida(100);
		Piloto piloto = new Piloto(carro);
		System.out.println(carro.getCapacidadeTanqueCombustivel());
		
		piloto.aumentaVelocidade();		
		System.out.println(carro.getQuantidadeCombustivel());
		System.out.println(carro.getPotencia());
		
		piloto.aumentaVelocidade();		
		System.out.println(carro.getQuantidadeCombustivel());
		System.out.println(carro.getPotencia());
	}

}
