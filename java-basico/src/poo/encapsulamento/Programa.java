package poo.encapsulamento;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa eu = new Pessoa("Bryan", 26, 02, 2002);
		
		System.out.println(eu.getNome());
		System.out.println(eu.getDataNascimento());
		System.out.println(eu.calculaIdade());
		
		eu.setNome("Bryan Santos");
		
		System.out.println(eu.getNome());
	}
}
