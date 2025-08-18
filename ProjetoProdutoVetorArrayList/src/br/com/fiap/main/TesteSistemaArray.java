package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;
import java.util.ArrayList;

public class TesteSistemaArray {

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

        //Preparar a lista para receber cadastro de produto
        ArrayList<Produto> listaProdutos = new ArrayList<>();


        //Preparar objeto produto
        Produto objProduto = null;


        //Entrada
        //Laço de repetição
        //int codigo, String descricao, String marca, String tipo, double valor

        do {
            objProduto = new Produto();
            objProduto.setCodigo(inteiro("Codigo"));
            objProduto.setDescricao(texto("Descrição"));
            objProduto.setMarca(texto("Marca"));
            objProduto.setTipo(texto("Tipo"));
            objProduto.setValor(real("Valor"));

            listaProdutos.add(objProduto);



        } while (JOptionPane.showConfirmDialog(null,
                " Cadastrar mais Produtos?", "CADASTRO DE PRODUTOS",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);


        for (Produto p: listaProdutos){
            System.out.println("\nCodigo: " + p.getCodigo() + "\nDescrição: " + p.getDescricao()
            + "\nMarca: " + p.getMarca() + "\nTipo: " + p.getTipo() + "\nValor: " + p.getValor());
        }



    }


}
