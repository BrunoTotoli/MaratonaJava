package br.com.abc.javacore.Rstrings.test;

public class StringPerformanceTest {
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		concatString(10);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo Gasto " + (fim - inicio) + " ms");

		inicio = System.currentTimeMillis();
		concatStringBuffer(9000000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo Gasto StringBuffer " + (fim - inicio) + " ms");

		inicio = System.currentTimeMillis();
		concatStringBuilder(9000000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo Gasto StringBuilder " + (fim - inicio) + " ms");

	}

	private static void concatString(int tam) {
		String string = "";
		for (int i = 0; i < tam; i++) { // Cada vez que iteramos esta sendo criado um valor novo na memoria
			string += i;
		}
	}

	private static void concatStringBuilder(int tam) {
		StringBuilder ab = new StringBuilder(tam);
		for (int i = 0; i < tam; i++) {
			ab.append(i);
		}
	}

	private static void concatStringBuffer(int tam) {
		StringBuffer ab = new StringBuffer(tam);
		for (int i = 0; i < tam; i++) {
			ab.append(i);
		}
	}
}
