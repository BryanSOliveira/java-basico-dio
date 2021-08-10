package date.javaCalendar;

import java.util.Calendar;

/**
 *  Algumas conversões de data
 */
public class Exemplo007 {

	public static void main(String[] args) {
		
		Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //seg. ago. 09 11:46:32 GMT-03:00 2021

        System.out.printf("%tF\n", agora);
        //2021-08-09

        System.out.printf("%tD\n", agora);
        //08/09/21

        System.out.printf("%tr\n", agora);
        //11:46:32 AM

        System.out.printf("%tT\n", agora);
        //11:46:32
	}
}
