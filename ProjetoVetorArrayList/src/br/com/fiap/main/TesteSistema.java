package br.com.fiap.main;


import br.com.fiap.beans.Aluno;

import javax.print.attribute.standard.Finishings;
import javax.swing.*;

public class TesteSistema {

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

        //Determinar a quantidade maxima de vetores

        Aluno[] vetorAluno = new Aluno[3];

        //indice para controlar as posições dos vetores
        int indice = 0;

        //laço de reptição
        //Entradas

        do {
            vetorAluno[indice] = new Aluno();
            vetorAluno[indice].setNome(texto("Digite o nome"));
            vetorAluno[indice].setTurma(texto("Digite a Turma"));
            vetorAluno[indice].setRm(texto("Digite o Rm"));
            vetorAluno[indice].setIdade(inteiro("Digite a idade"));
            vetorAluno[indice].setNota(real("Digite a nota"));

            indice++;

        } while (JOptionPane.showConfirmDialog(null,
                "Cadastrar mais alunos?",
                "CADASTRO DE ALUNO",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        // saidas utilizando o for

        for(int buscar=0;buscar<indice; buscar ++) {
            System.out.println(
                    "\n\nNome: " + vetorAluno[buscar].getNome()+
                    "\n\nTurma: " + vetorAluno[buscar].getTurma() +
                    "\n\nRm: " + vetorAluno[buscar].getRm() +
                    "\n\nIdade: " + vetorAluno[buscar].getIdade()+
                    "\n\nNota: " + vetorAluno[buscar].getNota());
        }
    }

}
