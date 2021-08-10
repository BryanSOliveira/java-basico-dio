package poo.polimorfismo.exercicio;

public class Atendente extends Funcionario {

	public double calcularImposto() {
		return this.getSalario() * 0.001;
	}
}
