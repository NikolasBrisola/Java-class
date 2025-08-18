package br.com.fiap.main;


import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteSistema {

    static String texto (String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro (String i){
        return Integer.parseInt(JOptionPane.showInputDialog(i));
    }

    static double real (String r){
        return Double.parseDouble(JOptionPane.showInputDialog(r));
    }

    public static void main(String[] args) {

        //Determinar a quantidade maxima de vetores

        Produto [] vetorProduto = new Produto[3];

        //indice para controlar as posições dos vetores
        int indice = 0;


        //laço de reptição
        //Entradas

        //int codigo, String descricao, String marca, String tipo, double valor
        do{
            vetorProduto[indice] = new Produto();
            vetorProduto[indice].setCodigo(inteiro("Codigo"));
            vetorProduto[indice].setDescricao(texto("Descrição"));
            vetorProduto[indice].setMarca(texto("Marca"));
            vetorProduto[indice].setTipo(texto("Tipo"));
            vetorProduto[indice].setValor(real("Valor"));

            indice++;


        }while(JOptionPane.showConfirmDialog(null,
                " Cadastrar mais Produtos?", "CADASTRO DE PRODUTOS",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);

        // saidas utilizando o for

        for(int buscar=0;buscar<indice; buscar ++) {
            System.out.println(
                    "\nCodigo: " + vetorProduto[buscar].getCodigo() +
                    "\nDescrição: " + vetorProduto[buscar].getDescricao() +
                    "\nMarca: " + vetorProduto[buscar].getMarca() +
                    "\nTipo: " + vetorProduto[buscar].getTipo() +
                    "\nValor: " + vetorProduto[buscar].getValor()


            );
        }

    }








}











