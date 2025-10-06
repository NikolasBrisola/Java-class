package br.com.fiap.api;

public class Endereco {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String estado;
    private String regiao;

    public Endereco() {
    }


    public Endereco(String cep, String regiao, String estado, String localidade, String bairro, String complemento, String logradouro) {
        this.cep = cep;
        this.regiao = regiao;
        this.estado = estado;
        this.localidade = localidade;
        this.bairro = bairro;
        this.complemento = complemento;
        this.logradouro = logradouro;
    }


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return "Informações de Endereco" +
                "\ncep: " + cep +
                "\nlogradouro: " + logradouro +
                "\ncomplemento: " + complemento +
                "\nbairro: " + bairro +
                "\nlocalidade: " + localidade +
                "\nestado: " + estado +
                "\nregiao: " + regiao;
    }
}
