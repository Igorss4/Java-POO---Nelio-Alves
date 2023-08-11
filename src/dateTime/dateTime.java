package dateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class dateTime {
	
	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); //data local
		LocalDateTime d02 = LocalDateTime.now(); //data e hora local
		Instant d03 = Instant.now(); // data e hora de londres (global)
		
		LocalDate d04 = LocalDate.parse("2023-08-02");
		LocalDateTime d05 = LocalDateTime.parse("2023-08-02T13:22");
		Instant d06 = Instant.parse("2023-08-02T01:30:26Z"); //horario de londres
		Instant d07 = Instant.parse("2023-08-02T01:30:26-03:00"); //horario de sp 
		
		LocalDate d08 = LocalDate.parse("02/08/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime d09 = LocalDateTime.parse("02/08/2023 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
				
		
		System.out.println("d01 = " + d01.toString());//imprime d01 = 2023-08-11
		System.out.println("d02 = " + d02);//imprime d02 = 2023-08-11T09:44:46.818852600
		System.out.println("d03 = " + d03);//imprime d03 = 2023-08-11T12:44:46.818852600Z
		System.out.println("d04 = " + d04);//imprime d04 = 2023-08-02
		System.out.println("d05 = " + d05);//imprime d05 = 2023-08-02T13:22
		System.out.println("d06 = " + d06);//imprime d06 = 2023-08-02T01:30:26Z
		System.out.println("d07 = " + d07);//imprime d07 = 2023-08-02T04:30:26Z
		System.out.println("d08 = " + d08);//imprime d08 = 2023-08-02
		System.out.println("d09 = " + d09);//imprime d09 = 2023-08-02T01:30
		System.out.println("d10 = " + d10);//imprime d10 = 2022-07-20
		System.out.println("d11 = " + d11);//imprime d11 = 2022-07-20T01:30
		System.out.println("------formatação------");
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//fmt6 usado para formatar datahora universal usando o id da zona do sistema do pc
		DateTimeFormatter fmt6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_DATE_TIME;//data local apenas, data global nao funfa
		DateTimeFormatter fmt8 = DateTimeFormatter.ISO_INSTANT;//para data global(instant)
		
		System.out.println("d04 = " + d04.format(fmt3));//imprime d04 = 02/08/2023
		System.out.println("d04 = " + fmt3.format(d04));//imprime d04 = 02/08/2023
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));//imprime d04 = 02/08/2023
		
		System.out.println("d05 = " + d05.format(fmt3));//imprime d05 = 02/08/2023
		System.out.println("d05 = " + d05.format(fmt4)); //imprime d05 = 02/08/2023 13:22
		System.out.println("d05 = " + d05.format(fmt7)); //imprime d05 = 2023-08-02T13:22:00
		
		System.out.println("d06 = " + fmt6.format(d06));//imprime d06 = 01/08/2023 22:30
		System.out.println("d06 = " + fmt8.format(d06));//imprime d06 = 2023-08-02T01:30:26Z
		System.out.println("----------Conversão--------");
		
//		for (String s : ZoneId.getAvailableZoneIds()) {		<- codigo para imprimir as zones validas
//			System.out.println(s);
//		}
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //converte um instant para uma data local, considerando o fuso horario do pc
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // converte pra portugal
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); //data e hora do pc 
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")); // data e hora de portugal
		
		System.out.println("r1 = " + r1);//imprime r1 = 2023-08-01
		System.out.println("r2 = " + r2);//imprime r2 = 2023-08-02
		System.out.println("r3 = " + r3);//imprime r3 = 2023-08-01T22:30:26
		System.out.println("r4 = " + r4);//imprime r4 = 2023-08-02T02:30:26
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());//imprime d04 dia = 2
		System.out.println("d04 mes = " + d04.getMonthValue());//imprime d04 mes = 8
		System.out.println("d04 ano = " + d04.getYear());//imprime d04 ano = 2023
		
		System.out.println("d05 hora = " + d05.getHour());//imprime d05 hora = 13
		System.out.println("d05 hora = " + d05.getMinute());//imprime d05 hora = 22
		System.out.println("-----Calculos com data-hora-----");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextYearLocalDate = d04.plusYears(7);
		
		System.out.println("d04 = " + d04);//imprime d04 = 2023-08-02
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);//imprime pastWeekLocalDate = 2023-07-26
		System.out.println("nextYearLocalDate = " + nextYearLocalDate);//imprime nextYearLocalDate = 2030-08-09
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextYearLocalDateTime = d05.plusYears(7);
		
		System.out.println("d05 = " + d05);//imprime d05 = 2023-08-02T13:22
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);//imprime pastWeekLocalDateTime = 2023-07-26T13:22
		System.out.println("nextYearLocalDateTime = " + nextYearLocalDateTime);//imprime nextYearLocalDateTime = 2030-08-02T13:22
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("d06 = " + d06);//imprime d06 = 2023-08-02T01:30:26Z
		System.out.println("pastWeekInstant = " + pastWeekInstant);//imprime pastWeekInstant = 2023-07-26T01:30:26Z
		System.out.println("nextWeekInstant = " + nextWeekInstant);//imprime nextWeekInstant = 2023-08-09T01:30:26Z
		System.out.println("-----Calcular duração-----");
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0,0));//quando a data nao tem time, necessario informar o horario 
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);//conta a duração entre datas
		Duration t3 = Duration.between(pastWeekInstant, d06);//
		Duration t4 = Duration.between(d06, pastWeekInstant);//
		
		
		System.out.println("t1 dias = " + t1.toDays());//imprime t1 dias = 7
		System.out.println("t2 dias = " + t2.toDays());//imprime t2 dias = 7
		System.out.println("t3 dias = " + t3.toDays());//imprime t3 dias = 7
		System.out.println("t4 dias = " + t4.toDays());//imprime t4 dias = -7
		
	}

}
