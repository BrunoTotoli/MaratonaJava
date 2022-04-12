package br.com.abc.javacore.Wnio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class PathMatcherTest02 {

    static class listFiles extends SimpleFileVisitor<Path> {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,class}");

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            if (matcher.matches(file)) {
                System.out.println(file.getFileName());
            }
            return FileVisitResult.CONTINUE;
        }
    }

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("");
        Files.walkFileTree(path, new listFiles());
    }


}
