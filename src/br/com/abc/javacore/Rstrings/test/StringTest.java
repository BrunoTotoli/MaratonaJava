package br.com.abc.javacore.Rstrings.test;

public class StringTest {
	public static void main(String[] args) {
		String nome = "Bruno"; // Aqui cria uma string na pool de string com a String bruno
		nome = nome.concat(" Totoli"); // nome += " Totoli" em questao de perfomance sao iguais.
		String nome2 = "Bruno"; // Aqui ira referenciar a string ja existente na pool de String e nao criar outra. 
		String nome3 = new String("Joao"); //1 - Variavel de referencia 2 - objeto do tipo String 3 - uma string no pool de string
		
		String teste = "sla";
		String teste2 = "            0123456789         ";
		
		System.out.println(teste.charAt(1));
		System.out.println(teste.replace('s', 'a'));
		System.out.println(teste2.substring(0,3));
		System.out.println(teste2.trim()); //Tira os espacos
	}
}
