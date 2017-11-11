package lista.exercicios.lsp.solucao;

public class Teste {

	public static void main(String[] args) {
		Carro carro = new Carro();		
		carro.mudaMarcha(Marcha.D);
		carro.mudaMarcha(Marcha.N);
	
		Aviao aviao = new Aviao();
		aviao.mudaMarcha(Marcha.D);
		aviao.mudaMarcha(Marcha.R);		
		System.out.println(aviao.getMarcha());
		
		carro.mudaMarcha(Marcha.R);		
		System.out.println(carro.getMarcha());
		
		carro.mudaMarcha(Marcha.D);
		carro.mudaMarcha(Marcha.R);		
		System.out.println(carro.getMarcha());
		
		
	}

}
