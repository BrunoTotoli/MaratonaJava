package br.com.abc.javacore.Mintefarces.test;

import br.com.abc.javacore.Mintefarces.classes.Produto;

public class TesteProduto {
	public static void main(String[] args) {
		Produto p = new Produto("Notebook",4,3000);
		p.calculaImposto();
		p.calcularFrete();
		System.out.println(p);
		
		
	}
}
