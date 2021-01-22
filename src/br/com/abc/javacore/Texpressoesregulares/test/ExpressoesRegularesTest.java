package br.com.abc.javacore.Texpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

    public static void main(String[] args) {
        // int numeroHex = 0XaFFF; // tem que comecar com 0 x ou X seguido de numeros e tambem vao ate a letra f.
        // \d todos os digitos
        // \D todos os nao digitos
        // \s espacos em branco \t \r \f \n
        // \S caracteres que nao sao branco
        // \w caracteres de palavra a-z A-Z digitos e _
        // \W tudo oque nao for palavra
        // [abcABC] apenas procure o que tiver dentro, procure a b c E A B C
        // ( )
        // |
        // &
        // o (v|c) = ovo, oco
        // maca (rr|c) ao = macarrao ou macacao
        // . coringa, pode ser substituido por qualquer caractere ex : 1.3 pode ser 1a3,1 3,1#3,1a3.
        // ^ [^abc] qualquer valor excetos abc
//        String regex ="0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
//        String regex ="([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z]+))+"; //([\\w\\._-])+@([a-zA-Z])+(\\.([a-zA-Z]+))+
//        String texto = "fulano@hotmail.com, 102abc@gmail.com, #@!abrao@mail, teste@gmail.com.br, teste@mail";
//        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
//        String texto = "05/10/2010, 05/1/2020, 01/01/65, 01/09/2098"; // dd/mm/yyyy

        String regex = "proj([^,])*";
        String texto = "proj1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto";
        Pattern patter = Pattern.compile(regex);
        Matcher matcher = patter.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressao: " + matcher.pattern());
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

    }
}
