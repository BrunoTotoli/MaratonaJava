package br.com.abc.javacore.Qwrappers.test;

public class WrappersTest {
	public static void main(String[] args) {
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 10;
		long longPrimitivo = 10L;
		float floatPrimitivo = 10F;
		double doublePrimitivo = 10D;
		char charPrimitivo = 'A';
		boolean booleanPrimitivo = true;

		Byte byteWrapper = 1;
		Short shortWrapper = 1;
		Integer integerWrapper = 1;
		Long longWrapper = Long.valueOf("10");
		Float floatWrapper = 10f;
		Double doubleWrapper = 10d;
		Character characterWrapper = 'A';
		Boolean booleanWrapper = true;
		
		String valor = "10";
		Float f = Float.parseFloat(valor);
		System.out.println(f);
		
		System.out.println(Character.isDigit('9')); 
		System.out.println(Character.isLetter('b'));
		System.out.println(Character.isLetterOrDigit('#'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.toUpperCase('a'));
		
		

	}
}
