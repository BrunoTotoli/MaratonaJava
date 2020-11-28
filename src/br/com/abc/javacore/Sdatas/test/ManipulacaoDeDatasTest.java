package br.com.abc.javacore.Sdatas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {
	public static void main(String[] args) {
		Date date = new Date();
		date.setTime(date.getTime()+3_600_000);
		System.out.println(date);
		
		Calendar c = Calendar.getInstance();
		//c.setTime(date);
		if(Calendar.SUNDAY == c.getFirstDayOfWeek()) {
			System.out.println("Domingo e o primeiro dia da semana");
		}
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		c.add(Calendar.HOUR, 24 );
		Date date2 = c.getTime();
		System.out.println(date2);
		
		//NumberFormat, Locale, Calendar, Date, DateFormat
		
		
		
	}
}
