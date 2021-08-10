package poo.polimorfismo.exercicio;

public class Programa {

	public static void main(String[] args) {
		Funcionario gerente = new Gerente();
		gerente.setSalario(10000);
		System.out.println("Imposto do Gerente: " + gerente.calcularImposto());
		
		Funcionario supervisor = new Supervisor();
		supervisor.setSalario(5000);
		System.out.println("Imposto do Supervisor: " + supervisor.calcularImposto());
		
		Funcionario atendente = new Atendente();
		atendente.setSalario(1000);
		System.out.println("Imposto do Atendente: " + atendente.calcularImposto());
	}
}
