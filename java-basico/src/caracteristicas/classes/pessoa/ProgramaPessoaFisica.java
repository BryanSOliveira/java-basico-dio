package caracteristicas.classes.pessoa;

public class ProgramaPessoaFisica {

	public static void main(String[] args) {
		final PessoaFisica pessoaFisica = new PessoaFisica(19, 67.5f);
		
		System.out.println(pessoaFisica.relatorio());
	}
}
