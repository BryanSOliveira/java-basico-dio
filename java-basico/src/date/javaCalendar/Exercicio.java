package date.javaCalendar;

import java.util.Calendar;

public class Exercicio {

	public static void main(String[] args) {
		
		Calendar dataVencimento = Calendar.getInstance();
		
		dataVencimento.add(Calendar.DATE, 10);
		dataVencimento.add(Calendar.DAY_OF_WEEK, 10);
		
		if(dataVencimento.DAY_OF_WEEK == 7) {
			dataVencimento.add(Calendar.DATE, 2);
			dataVencimento.add(Calendar.DAY_OF_WEEK, 2);
		} else if(dataVencimento.DAY_OF_WEEK == 1) {
			dataVencimento.add(Calendar.DATE, 1);
			dataVencimento.add(Calendar.DAY_OF_WEEK, 1);
		}
		
		System.out.println("Vencimento da fatura em: " + dataVencimento.getTime());
	}
}
