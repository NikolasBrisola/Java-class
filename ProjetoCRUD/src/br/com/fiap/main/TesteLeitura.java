package br.com.fiap.main;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TesteLeitura {

    static String texto (String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String i) {
        return Integer.parseInt(JOptionPane.showInputDialog(i));
    }

    static double real (String r) {
        return Double.parseDouble(JOptionPane.showInputDialog(r));
    }




    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        AlunoDAO alunoDao = new AlunoDAO();

        List<Aluno> listaAlunos = (ArrayList<Aluno>) alunoDao.selecionar();

        if(listaAlunos !=null){
            for(Aluno a : listaAlunos){
                System.out.println(
                        a.getRm() + " " +
                        a.getNome() + " " +
                        a.getTurma() + " " +
                        a.getNota() + " "




                );
            }
        }

    }
}
