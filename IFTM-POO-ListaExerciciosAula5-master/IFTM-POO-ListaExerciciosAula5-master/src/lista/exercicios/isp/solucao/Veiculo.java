package lista.exercicios.isp.solucao;

public abstract class Veiculo implements Liga, Desliga {

	private boolean motorLigado;

	public boolean isMotorRodando() {
		return motorLigado;
	}

	@Override
	public void ligar() {
		motorLigado = true;
	}

	@Override
	public void desligar() {
		motorLigado = false;
	}

}