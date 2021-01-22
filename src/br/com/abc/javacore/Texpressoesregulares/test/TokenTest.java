package br.com.abc.javacore.Texpressoesregulares.test;

public class TokenTest {
    public static void main(String[] args) {
        String str = "Paulo, Joao, Kamila, Ana, Jhon, Matheus";
        String[] tokens = str.split(",");
        for(String array : tokens){
            System.out.println(array.trim());
        }
    }
}
