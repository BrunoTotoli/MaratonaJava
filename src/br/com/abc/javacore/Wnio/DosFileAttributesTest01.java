package br.com.abc.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path paths = Paths.get("pasta/teste.txt");
        if (Files.notExists(paths))
            Files.createFile(paths);

        Files.setAttribute(paths, "dos:hidden", true); //Oculta
        Files.setAttribute(paths, "dos:readonly", true); //Apenas leitura

        Files.setAttribute(paths, "dos:hidden", false);
        Files.setAttribute(paths, "dos:readonly", false);


        DosFileAttributes dosFileAttributes = Files.readAttributes(paths, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());


        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(paths, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);
        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isReadOnly());


    }
}
