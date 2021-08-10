package date.javaLocalDate;

import java.time.LocalTime;

/**
 * Exemplo de como manioular LocalTime
 */
public class Exemplo013 {

	public static void main(String[] args) {
		
		LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 13:57:21.120259100

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        // 14:57:21.120259100

	}
}
