package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ProgramCalculandoDataHora {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");  
		
		LocalDate pastWeekLocalDate = d04.minusDays(7); //subtraindo 7 dias
		LocalDate nextWeekLocalDate = d04.plusDays(7); //adicionando 7 dias
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); 
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekIntant = d06.minus(7, ChronoUnit.DAYS); 
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekIntant = " + pastWeekIntant);
		System.out.println("pastWeekIntant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05); //calculando entre as datas
		System.out.println("t1 = " + t1.toDays());
	}

}
