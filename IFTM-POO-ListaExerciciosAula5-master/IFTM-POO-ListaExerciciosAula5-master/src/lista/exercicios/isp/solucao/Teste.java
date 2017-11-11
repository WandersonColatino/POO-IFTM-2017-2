package lista.exercicios.isp.solucao;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("******** CARRO ********");
		Carro carro = new Carro();
		carro.ligar();
		carro.ligarRadio();
		System.out.println("MotorRodando? " + carro.isMotorRodando());
		System.out.println("Radio ON? " + carro.isRadioOn());
		carro.desligar();
		carro.desligarRadio();
		System.out.println("MotorRodando? " + carro.isMotorRodando());
		System.out.println("Radio ON? " + carro.isRadioOn());
		
		
		System.out.println("");
		System.out.println("******** DRONE ********");		
		Drone drone = new Drone();
		drone.ligar();
		drone.ligarCamera();
		System.out.println("MotorRodando? " + drone.isMotorRodando());
		System.out.println("Camera ON? " + drone.isCameraOn());
		drone.desligar();
		drone.desligarCamera();
		System.out.println("MotorRodando? " + drone.isMotorRodando());
		System.out.println("Camera ON? " + drone.isCameraOn());
	}

}
