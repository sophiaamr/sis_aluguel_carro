package com.javatpoint.beans;

public class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String profissao;
    private String entidadesEmpregadoras;
    private double respectivoRendimentoAuferido;
    private int tipoUsuarioId; // Referência ao tipo de usuário

    // Getter e Setter para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter e Setter para rg
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    // Getter e Setter para profissao
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // Getter e Setter para entidadesEmpregadoras
    public String getEntidadesEmpregadoras() {
        return entidadesEmpregadoras;
    }

    public void setEntidadesEmpregadoras(String entidadesEmpregadoras) {
        this.entidadesEmpregadoras = entidadesEmpregadoras;
    }

    // Getter e Setter para respectivoRendimentoAuferido
    public double getRespectivoRendimentoAuferido() {
        return respectivoRendimentoAuferido;
    }

    public void setRespectivoRendimentoAuferido(double respectivoRendimentoAuferido) {
        this.respectivoRendimentoAuferido = respectivoRendimentoAuferido;
    }

    // Getter e Setter para tipoUsuarioId
    public int getTipoUsuarioId() {
        return tipoUsuarioId;
    }

    public void setTipoUsuarioId(int tipoUsuarioId) {
        this.tipoUsuarioId = tipoUsuarioId;
    }
}
