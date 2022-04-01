package br.com.abc.javacore.Vio.test;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console c = System.console();
        char[] pw = c.readPassword("%s", "pw: ");
        for (char a : pw) {
            c.format("%c", a);
        }
        c.format("\n");
        String texto;
        while (true) {
            texto = c.readLine("%s", "Digite: ");
            c.format("Esse texto %s foi digitado: ", retorno(texto));
        }


    }

    public static String retorno(String arg1) {
        return arg1;
    }
}

