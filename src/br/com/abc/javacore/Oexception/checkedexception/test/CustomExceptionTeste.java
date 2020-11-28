package br.com.abc.javacore.Oexception.checkedexception.test;

import br.com.abc.javacore.Oexception.customexceptions.LoginInvalidoException;

public class CustomExceptionTeste {
	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		};
	}

	public static void logar() throws LoginInvalidoException {
		String usuario = "admin";
		String senha = "111";
		String usuarioDigitado = "admin";
		String senhaDigitado = "123";
		if (!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitado)) {
			throw new LoginInvalidoException();
		}else {
			System.out.println("Logado");
		}
	}
}
