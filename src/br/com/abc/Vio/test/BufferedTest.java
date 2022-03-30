package br.com.abc.Vio.test;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))) {
            bw.write("Escrevendo uma mensagem no arquivo");
            bw.newLine();
            bw.write("pulando uma linha");
            bw.flush();
            String s1;
            while ((s1 = br.readLine()) != null) {
                System.out.println(s1);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    /*
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Escrevendo uma mensagem no arquivo");
            bw.newLine();
            bw.write("pulando uma linha");
            bw.flush();
            bw.close();


            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
     */
    }
}
