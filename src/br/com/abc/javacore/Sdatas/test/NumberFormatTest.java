package br.com.abc.javacore.Sdatas.test;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 212.4567f;
        Locale locJP = new Locale("jp");
        Locale locFR = new Locale("fr");
        Locale locIT = new Locale("it");
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locIT);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locIT);

        for(NumberFormat a : nfa){
            System.out.println(a.format(valor));
        }
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());
        nf.setMaximumFractionDigits(3);
        System.out.println(nf.format(valor));
        String valorString = "212,4567";
        try {
            System.out.println((nf.parse(valorString)));
            nf.setParseIntegerOnly(true);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
