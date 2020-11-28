package br.com.abc.javacore.Npolimorfismo.test;

import br.com.abc.javacore.Npolimorfismo.classes.Gerente;
import br.com.abc.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
	public static void main(String[] args) {
		Gerente g = new Gerente("Jo", 5000, 20000);
		Vendedor v = new Vendedor("Josimar", 2000, 20000);
		RelatorioPagamento r = new RelatorioPagamento();
		// r.relatorioPagamentoGerente(g);
		// r.relatorioPagamentoVendedor(v);
		r.relatorioPagamentoGenerico(v);
	}
}
