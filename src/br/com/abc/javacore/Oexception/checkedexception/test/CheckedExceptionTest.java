package br.com.abc.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
	public static void main(String[] args) {
		abrirArquivo();

	}

	public static void criarArquivo()throws IOException {
		try {
			File file = new File("teste.txt");
			System.out.println("Arquivo criado: " + file.createNewFile());
		} catch (Exception e) {
			e.printStackTrace();
			throw e; // Lancando a excecao para cima;
		}

	}

	public static void abrirArquivo()  {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Executando a leitura do arquivo");
			System.out.println("Escrevendo no arquivo");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Fechar o arquivo");
		}

	}
}
