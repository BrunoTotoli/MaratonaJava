package br.com.abc.javacore.Sdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
	public static void main(String[] args) {
		// ISO 639 pt= portugues BR = Brazil, en ingles, US estados unidos.
		Locale locItaly = new Locale("it","IT");
		Locale locSuica = new Locale("it", "CH");
		Locale locIndia = new Locale("hi", "IN");
		Locale locJapao = new Locale("ja");
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.DECEMBER, 23);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locItaly);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,locSuica);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,locIndia);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,locJapao);
		System.out.println(df.format(c.getTime()));
		System.out.println(df2.format(c.getTime()));
		System.out.println(df3.format(c.getTime()));
		System.out.println(df4.format(c.getTime()));
		
		System.out.println(locItaly.getDisplayLanguage());
		System.out.println(locJapao.getDisplayLanguage(locItaly));
		System.out.println(locSuica.getDisplayCountry(locItaly));
	}
}
