package date.javaDateFormat;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Exercicio {

	public static void main(String[] args) {
		
		Date data = new Date();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:mmm");
		
		String dataFormatada = formato.format(data);
		
		System.out.println(dataFormatada);
	}
}
