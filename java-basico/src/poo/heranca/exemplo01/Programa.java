package poo.heranca.exemplo01;

public class Programa {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setMarca("Nissan");
		carro.setModelo("March");
		carro.setQuantidadeDePortas(4);
		
		Motocicleta moto = new Motocicleta();
		moto.setMarca("DUCATI");
		moto.setModelo("STREETFIGHTER");
		moto.setCilindradas("850");
	}
}
