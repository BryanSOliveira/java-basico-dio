package poo.classe.exercicio;

public class Programa {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		System.out.println("Quantidade de pessoas: " + carro.getQuantidadeDePessoas());
		carro.adicionarPessoas();
		carro.adicionarPessoas();
		System.out.println("Quantidade de pessoas: " + carro.getQuantidadeDePessoas());
		carro.removerPessoas();
		System.out.println("Quantidade de pessoas: " + carro.getQuantidadeDePessoas());
	}
}
