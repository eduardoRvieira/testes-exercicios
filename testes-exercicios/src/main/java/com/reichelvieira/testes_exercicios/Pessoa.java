package com.reichelvieira.testes_exercicios;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public String nomeSolteiraMae;
    public String cidadeNatal;

    public Pessoa(String nome, String sobrenome, String nomeSolteiraMae, String cidadeNatal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeSolteiraMae = nomeSolteiraMae;
        this.cidadeNatal = cidadeNatal;
    }

    public static String gerarNomeSW(Pessoa p){
        String primeiroNomeSW = p.sobrenome.substring(0, 3) + p.nome.substring(0, 2);

        String sobrenomeSW = p.nomeSolteiraMae.substring(0, 2) + p.cidadeNatal.substring(0, 3);

        return p.formatarMaiuscula(primeiroNomeSW) + " " + p.formatarMaiuscula(sobrenomeSW);
    }

    private String formatarMaiuscula(String texto) {
        if (texto == null || texto.isEmpty()) return texto;
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }
}
