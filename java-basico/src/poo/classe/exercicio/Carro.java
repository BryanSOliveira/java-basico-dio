package poo.classe.exercicio;

public class Carro {
	private int quantidadeDePessoas = 1;

	public int getQuantidadeDePessoas() {
		return quantidadeDePessoas;
	}
	
	public void adicionarPessoas() {
		++quantidadeDePessoas;
		System.out.println("Adicionando...");
	}
	
	public void removerPessoas() {
		--quantidadeDePessoas;
		System.out.println("Removendo...");
	}
}
