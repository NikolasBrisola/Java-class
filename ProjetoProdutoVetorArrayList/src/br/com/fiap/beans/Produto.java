package br.com.fiap.beans;

public class Produto {

    //visibilidade e tipo de atributos

    private int codigo;
    private String tipo;
    private String marca;
    private String descricao;
    private double valor;


    public Produto() {
    }


    public Produto(int codigo, String descricao, String marca, String tipo, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.marca = marca;
        this.tipo = tipo;
        this.valor = valor;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Produto: " +
                "\ncodigo: " + codigo +
                "\ntipo: " + tipo +
                "\nmarca: " + marca +
                "\ndescricao: " + descricao +
                "\nvalor: " + valor;
    }
}
