package br.com.abc.javacore.Oexception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
	public static void main(String[] args) {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
			System.out.println("Dentro do ArrayIndexOutOfBoundsException ");
		}
		System.out.println("FInal do programa");
		try {
			talvezLanceException();
		} catch (SQLException | IOException e) {

		}
	}

	private static void talvezLanceException() throws SQLException, IOException {

	}
}
