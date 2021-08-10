package date.javaLocalDate;

import java.time.LocalDateTime;

/**
 * Exemplo de como manipular LocalDateTime
 */
public class Exemplo014 {

	public static void main(String[] args) {
	
		LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        // 2021-08-09T13:59:55.841612300

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        // 2021-08-11T15:00:07.841612300
	}
}
