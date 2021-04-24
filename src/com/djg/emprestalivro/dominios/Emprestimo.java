package com.djg.emprestalivro.dominios;

import java.util.Date;

public class Emprestimo {

    private int codigoSolicitacao;
    private Usuario usuario;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "codigoSolicitacao=" + codigoSolicitacao +
                ", usuario=" + usuario.getNomeCompleto() +
                ", livro=" + livro.getNome() +
                ", dataEmprestimo='" + dataEmprestimo + '\'' +
                ", dataDevolucao='" + dataDevolucao + '\'' +
                '}';
    }

}
