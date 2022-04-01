package br.com.abc.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
        /*
        File diretorio = new File("folder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Diretorio criado :"+mkdir);
        File arquivo = new File(diretorio,"arquivo.txt");
        boolean newFile = arquivo.createNewFile();
        System.out.println("Arquivo criado: "+newFile);
        File arquivoNovoNome = new File(diretorio,"arquivo_renomeado.txt");
        boolean rename = arquivo.renameTo(arquivoNovoNome);
        System.out.println("Renomeado: "+rename);
        File diretorioRenomeado = new File("folder2");
        boolean diretorioRenomeadoB = diretorio.renameTo(diretorioRenomeado);
        System.out.println("Diretorio renomeado: "+diretorioRenomeado);
         */
        buscarArquivos();
    }

    public static void buscarArquivos(){
        File file = new File("folder2");
        String[] list = file.list();
        for(String arquivo:list){
            System.out.println(arquivo);
        }
    }

}
