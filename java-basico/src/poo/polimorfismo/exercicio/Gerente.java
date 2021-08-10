package poo.polimorfismo.exercicio;

public class Gerente extends Funcionario{

	public double calcularImposto() {
		return this.getSalario() * 0.01;
	}
}
