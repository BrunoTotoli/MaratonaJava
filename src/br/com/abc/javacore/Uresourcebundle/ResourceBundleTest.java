package br.com.abc.javacore.Uresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("messages", Locale.US);
        System.out.println(rb.getString("good.morning"));
        rb = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("show"));
        //Locale locale = new Locale("fr","CA")
        //ResourceBundle.getBundle("messages",locale);
        //Processos recursivos para encontrar o resource bundle

        //messages_fr_CA.properties
        //messages_fr.properties
        //messages_pt_BR.properties
        //messages_pt.properties
        //messages.properties
        //Lanca excecao

    }



}
