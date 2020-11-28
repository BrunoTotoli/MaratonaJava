package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		estudante.setNome("William Suane");
		estudante.setIdade(-1);
		estudante.setNotas(new double[] { 3, 2, 9.5 });
		estudante.print();
		estudante.tirarMedia();
		System.out.println("Aprovado? " + estudante.isAprovado());

	}
}
