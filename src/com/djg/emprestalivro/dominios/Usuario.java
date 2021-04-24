package com.djg.emprestalivro.dominios;

public class Usuario {
    private int codigoUsuario;
    private String nomeCompleto;
    private String dataNascimento;
    private String endereco;

    public Usuario (String nome, String nascimento, String endereco) {
        this.nomeCompleto = nome;
        this.dataNascimento = nascimento;
        this.endereco = endereco;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "Código: " + this.codigoUsuario + "\nNome: " + this.nomeCompleto +
                            "\nNascimento: " + this.dataNascimento + "\nEndereço: " + endereco;
    }

}
