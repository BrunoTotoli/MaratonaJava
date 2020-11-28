package br.com.abc.javacore.Oexception.customexceptions;

public class LoginInvalidoException extends Exception {

	public LoginInvalidoException() {
		super("Usuario ou senha invalido");
	}
	
}
