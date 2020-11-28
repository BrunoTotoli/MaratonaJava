package br.com.abc.introducao.controlefluxo;

public class ControleFluxo2 {
	public static void main(String[] args) {
		int idade = 15;
		String status;
		status = idade < 18 ? "Nao adulto" : "adulto";
		System.out.println(status);
	}
}
