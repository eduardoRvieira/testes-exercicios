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

    public String gerarNomeSW(){
        String primeiroNomeSW = sobrenome.substring(0, 3) + nome.substring(0, 2);

        String sobrenomeSW = nomeSolteiraMae.substring(0, 2) + cidadeNatal.substring(0, 3);

        return formatarMaiuscula(primeiroNomeSW) + " " + formatarMaiuscula(sobrenomeSW);
    }

    private String formatarMaiuscula(String texto) {
        if (texto == null || texto.isEmpty()) return texto;
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }
}
