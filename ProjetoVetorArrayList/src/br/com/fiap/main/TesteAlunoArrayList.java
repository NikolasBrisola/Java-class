package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;
import java.util.ArrayList;

public class TesteAlunoArrayList {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static Integer inteiro(String i) {
        return Integer.parseInt(JOptionPane.showInputDialog(i));
    }

    static Double real(String r) {
        return Double.parseDouble(JOptionPane.showInputDialog(r));
    }

    public static void main(String[] args) {

        //Preparar a lista para receber cadastro de alunos
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        //Preparar objeto aluno
        Aluno objAluno = null;

        //Entrada
        //Laço de repetição

        do {
            objAluno = new Aluno();
            objAluno.setNome(texto("nome"));
            objAluno.setTurma(texto("turma"));
            objAluno.setIdade(inteiro("idade"));
            objAluno.setRm(texto("Rm"));
            objAluno.setNota(real("nota"));


            ListaAlunos.add(objAluno);

        }while (JOptionPane.showConfirmDialog(null,
                    "Cadastrar mais alunos?",
                    "CADASTRO DE ALUNO",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) ;

        //foreach percorre todos os elementos para serem exibidos
        for(Aluno a: listaAlunos){
            System.out.println("\nNome: " + a.getNome()+
                    "\nTurma: " + a.getTurma()+
                    "\nRm: " + a.getRm()+
                    "\nIdade: " + a.getIdade()+
                    "\nNota: " + a.getNota());
        }


        }
    }
