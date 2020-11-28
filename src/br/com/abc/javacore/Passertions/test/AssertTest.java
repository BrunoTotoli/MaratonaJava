package br.com.abc.javacore.Passertions.test;

public class AssertTest {
	public static void main(String[] args) {
		calculaSalario(-1);
		diasDaSemana(8);
	}

	private static void calculaSalario(double salario) {
		// Fazer calculo com salario
		assert (salario > 0);
	}

	public static void diasDaSemana(int dia) {
		switch (dia) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		default:
			assert false;

		}
	}
}
