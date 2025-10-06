package br.com.fiap.main;

import br.com.fiap.api.Endereco;
import br.com.fiap.services.ViaCepService;

import javax.swing.*;
import java.awt.*;

public class TesteViapCep {


    static String texto (String j){
        return JOptionPane.showInputDialog(j);
    }

    public static void main(String[] args) {

        ViaCepService viacep = new ViaCepService();

        String cep = texto("informe o Cep para busca");


        Endereco endereco = viacep.getEndereco(cep);

        System.out.println(endereco);



    }



}
