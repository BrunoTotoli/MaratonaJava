package br.com.abc.javacore.Wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Bruno\\IdeaProjects\\MaratonaJava\\arquivo.txt");
        Path p2 = Paths.get("C:", "User", "Bruno", "IdeaProjects", "MaratonaJava", "arquivo.txt");
        //O metodo get possui varArgs, voce pode passar o path separado por virgulas e nao \\
        System.out.println(p2.toAbsolutePath());
        File file = p2.toFile();
        Path path = file.toPath();
        Path path1 = Paths.get("pasta");
        Path path2 = Paths.get("pasta\\subpasta\\subsubpasta\\file.txt");
        Path arquivo = Paths.get("pasta\\subpasta\\subsubpasta\\file.txt");
        try {
//            if (Files.notExists(path1))
//                Files.createDirectory(path1);
            if (Files.notExists(path2.getParent())) {
                Files.createDirectories(path2.getParent());
            }
            if (Files.notExists(arquivo))
                Files.createFile(arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path source = Paths.get("pasta\\subpasta\\subsubpasta\\file.txt");
        Path target = Paths.get("pasta\\subpasta\\subsubpasta\\arquivoCopiado.txt");
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            Files.deleteIfExists(target);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
