package br.com.abc.javacore.Wnio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path dir : stream) {
                System.out.println(dir.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
