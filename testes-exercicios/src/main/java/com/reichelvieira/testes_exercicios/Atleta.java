package com.reichelvieira.testes_exercicios;

public class Atleta {
    public String nome;
    public int idade;
    public double altura;
    public double peso;

    public Atleta(String nome, int idade, double altura, double peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Atleta(){}

    public String classificaCategoriaIdade(){

        String classificacao = "";

        if (idade < 5){
            return "Idade Inválida";
        } else if (idade <= 7){
            classificacao = "Pré-mirim";
        } else if(idade <= 10){
            classificacao = "Mirim";
        } else if (idade <= 13) {
            classificacao = "Infantil";
        } else if (idade <= 17) {
            classificacao = "Infanto-juvenil";
        } else if (idade <= 20){
            classificacao = "Juvenil";
        } else {
            classificacao = "Adultos maiores que 21 anos";
        }

        return classificacao;
    }

    private double calculaIMC(){
        return peso/(altura*altura);
    }

    public String classificaIMC(){
        double IMC = calculaIMC();

        String classificacao = "";

        if (IMC < 18.5){
            classificacao = "Magreza";
        } else if (IMC < 24.9) {
            classificacao = "Saudável";
        } else if (IMC < 29.9) {
            classificacao = "Sobrepeso";
        } else if (IMC < 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (IMC < 39.9){
            classificacao = "Obesidade Grau II";
        } else {
            classificacao = "Obesidade Morbida";
        }

        return classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
