package br.com.abc.javacore.Rstrings.test;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		String s = "Uma frase comum";
		StringBuilder sb = new StringBuilder(10);
		sb.append("0123456789");
		System.out.println(sb.reverse()); //Vai inverter a string
		System.out.println(sb.delete(0, 2)); /*Da mesma forma do substring da classe String, o primeiro argumento ira considerar que o indice comeca
		do zero e o segundo argumento considera que comeca no 1 */
		System.out.println(sb.insert(2, "****"));
		
		
		
	}
}
