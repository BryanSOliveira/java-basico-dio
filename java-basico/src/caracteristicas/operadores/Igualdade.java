package caracteristicas.operadores;

public class Igualdade {

	public static void main(String[] args) { 
		
		final var numero = 11;
		
		if (numero == 10) {
			System.out.println("O n�mero � 10");
		} else {
			System.out.println("O n�mero n�o � 10");
		}
		
		if (numero != 10) {
			System.out.println("O n�mero n�o � 10");
		} else {
			System.out.println("O n�mero � 10");
		}
		
		final var letra = "B";
		
		if("A".equals(letra)) {
			System.out.println("� a letra A");
		}
		
		if (!letra.equals("A")) {
			System.out.println("N�o � a letra A");
		}
	}
}
