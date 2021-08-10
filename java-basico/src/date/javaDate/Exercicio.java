package date.javaDate;

import java.util.Date;

public class Exercicio {

	public static void main(String[] args) {
		
		Date dataNascimento = new Date(1014692400000L);
		//Tue Feb 26 00:00:00 GMT-03:00 2002
		
		Date dataRecebida = new Date(1273892400000L);
		//Sat May 15 00:00:00 GMT-03:00 2010
		
		boolean isBefore = dataNascimento.before(dataRecebida);
		
		System.out.println(isBefore);
		
		boolean isAfter = dataNascimento.after(dataRecebida);
		
		System.out.println(isAfter);
	}
}
