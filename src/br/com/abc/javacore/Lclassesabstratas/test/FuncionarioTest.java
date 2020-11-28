package br.com.abc.javacore.Lclassesabstratas.test;

import br.com.abc.javacore.Lclassesabstratas.classes.Gerente;
import br.com.abc.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
	public static void main(String[] args) {
		Gerente g = new Gerente("Josivan","777",2000);
		Vendedor v = new Vendedor("Claudiovan","666",2000,5000);
		v.calculaSalario();
		g.calculaSalario();
		System.out.println(g);
		System.out.println(v);
	}
}
