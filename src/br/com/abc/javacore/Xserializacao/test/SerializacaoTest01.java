package br.com.abc.javacore.Xserializacao.test;

import br.com.abc.javacore.Xserializacao.dominio.Aluno;
import br.com.abc.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Jaime", "senhafoda123");
        aluno.setTurma(new Turma("Dentro da turma"));
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/Aluno.ser");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            outputStream.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("pasta/Aluno.ser");
        try (ObjectInputStream objectInputStream = new ObjectInputStream((Files.newInputStream(path)))) {
            Aluno aluno = (Aluno) objectInputStream.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
