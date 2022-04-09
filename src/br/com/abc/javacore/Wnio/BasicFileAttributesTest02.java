package br.com.abc.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/subpasta/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        System.out.println("CreationTime: " + creationTime);
        System.out.println("LastModifiedTime: " + lastModifiedTime);
        System.out.println("LastAcessTime: " + lastAccessTime);

        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime time = FileTime.fromMillis(System.currentTimeMillis());
        basicFileAttributeView.setTimes(lastModifiedTime, time, creationTime);
        creationTime = basicFileAttributeView.readAttributes().creationTime();
        lastModifiedTime = basicFileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = basicFileAttributeView.readAttributes().lastAccessTime();
        System.out.println("_________________________");
        System.out.println("CreationTime: " + creationTime);
        System.out.println("LastModifiedTime: " + lastModifiedTime);
        System.out.println("LastAcessTime: " + lastAccessTime);

    }
}
