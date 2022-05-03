package br.com.abc.javacore.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {

    private static final long serialVersionUID = -8262068631532023394L;
    private Long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "Nome da escola";
    private transient Turma turma;

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeUTF(turma.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Serial
    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            String nameTurma = objectInputStream.readUTF();
            turma = new Turma(nameTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", Nome Escola= " + NOME_ESCOLA +
                ", Turma" + turma + "}";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
