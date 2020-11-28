package br.com.abc.javacore.Npolimorfismo.test;

import java.util.LinkedList;
import java.util.List;

import br.com.abc.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
import br.com.abc.javacore.Npolimorfismo.classes.GenericDAO;

public class DAOTest {
	public static void main(String[] args) {

		GenericDAO arquivo = new ArquivoDAOImpl(); /*alterar o ArquivoDAOImpl para DatabaseDAOImpl ele ira executar o metodo de cada*/
		arquivo.save();
		List<String> lista = new LinkedList<>();
		lista.add("Teste 1");
		lista.add("Teste 2");
		lista.add("Teste 3");
		lista.add("Teste 4");
		for(String aux : lista) {
			System.out.println(aux);
		}
	}
}
