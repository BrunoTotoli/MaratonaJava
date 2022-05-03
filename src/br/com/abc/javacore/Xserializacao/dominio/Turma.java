package br.com.abc.javacore.Xserializacao.dominio;

public class Turma {
    private String name;

    public Turma(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
