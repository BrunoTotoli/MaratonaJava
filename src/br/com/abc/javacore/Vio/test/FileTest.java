package br.com.abc.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            boolean newFile = file.createNewFile(); //false se o arquivo ja existir true se for  criar
            boolean exists = file.exists();//Saber se o arquivo existe
            boolean delete = file.delete();//Deleta arquivo
            boolean canRead = file.canRead();//Se arquivo possui permissao de leitura
            String path = file.getPath();//Para saber o path que utilizou no construtor
            String absolutePath = file.getAbsolutePath(); //Para saber o path completo do arquivo
            boolean directory = file.isDirectory(); //Se e um diretorio
            boolean hidden = file.isHidden(); //Se o arquivo esta oculto
            long lastModified = file.lastModified(); //Quando o arquivo foi modificado pela ultima vez, retorna em milisegundos long
            System.out.println(path);
            System.out.println(absolutePath);
            System.out.println("Last modified: "+new Date(file.lastModified()));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
