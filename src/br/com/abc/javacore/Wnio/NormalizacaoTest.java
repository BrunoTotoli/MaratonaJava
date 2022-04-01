package br.com.abc.javacore.Wnio;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTest {

    public static void main(String[] args) {
        String diretorioProjeto = "home\\bruno\\dev";
        String arquivoTxt = "..\\..\\arquivo.txt";
        Path p1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());
        Path p2 = Paths.get("home/./bruno/./dev");
        System.out.println(p2);
        System.out.println(p2.normalize());


        try (BufferedReader br = new BufferedReader(new FileReader(p1.toFile()))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
