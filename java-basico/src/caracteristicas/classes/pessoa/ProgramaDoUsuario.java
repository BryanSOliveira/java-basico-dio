package caracteristicas.classes.pessoa;

import caracteristicas.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {

	public static void main(String[] args) {
		final var batman = new SuperUsuario("batman", "1234%$#@");
		
		batman.getLogin();
		
		//batman.getSenha();	//ERRO
		
		//String nomeDoCliente = batman.nome; //ERRO
	}
}
