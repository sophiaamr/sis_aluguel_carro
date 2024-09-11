package com.example.beans;

public class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String profissao;
    private String entidadeEmpregadora;
    private double rendimentoAuferido;
    private String tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEntidadeEmpregadora() {
        return entidadeEmpregadora;
    }

    public void setEntidadeEmpregadora(String entidadeEmpregadora) {
        this.entidadeEmpregadora = entidadeEmpregadora;
    }

    public double getRendimentoAuferido() {
        return rendimentoAuferido;
    }

    public void setRendimentoAuferido(double rendimentoAuferido) {
        this.rendimentoAuferido = rendimentoAuferido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
