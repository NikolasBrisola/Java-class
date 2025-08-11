package br.com.fiap.beans;

public class Aluno {

    private String nome;
    private String turma;
    private String rm;
    private int idade;
    private double nota;

    public Aluno() {
    }

    public Aluno(String nome, double nota, int idade, String rm, String turma) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        this.rm = rm;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getRm() {
        return rm;
    }

    public void setRm(String rm) {
        this.rm = rm;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "INFORMAÇÕES DO ALUNO" +
                "\nome:" + nome +
                "\nturma: " + turma +
                "\nrm: " + rm +
                "\nidade: " + idade +
                "\nnota: " + nota;
    }
}
