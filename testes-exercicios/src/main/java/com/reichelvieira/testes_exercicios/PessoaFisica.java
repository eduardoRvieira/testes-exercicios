package com.reichelvieira.testes_exercicios;

public class PessoaFisica {
    private String nome;
    private String cpf;
    private UF uf;
    private double rendaAnual;

    public PessoaFisica(){}

    public PessoaFisica(String nome, String cpf, UF uf, double rendaAnual){
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;
    }

    public double calculaImposto(){
        if (rendaAnual < 0){
            throw new IllegalArgumentException("A renda anual não pode ser negativa");
        }

        double aliquota = 0;

        if (rendaAnual <= 4000){
            aliquota = 0;
        } else if (rendaAnual <= 9000) {
            aliquota = 0.058;
        } else if (rendaAnual <= 25000){
            aliquota = 0.15;
        } else if (rendaAnual <= 35000) {
            aliquota = 0.275;
        } else {
            aliquota = 0.30;
        }

        return rendaAnual*aliquota;
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

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
}
