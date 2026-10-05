package com.reichelvieira.testes_exercicios;

public class Atividade {

    public static boolean parOuImpar(double num){
        boolean resultado = false;
        if (num %2 == 0) {
            resultado = true;
        }

        return resultado;
    }

    public static String estacoesDoAno(int num){
        String frase = "";

        switch (num) {
            case 1:
                frase = "É verão\nE o tempo está quente.";
                break;
            case 2:
                frase = "É outono\nE as folhas caem.";
                break;
            case 3:
                frase = "É primavera\nE as flores nascem";
                break;
            case 4:
                frase = "É inverno\nE o tempo está frio";
                break;
            default:
                throw new NumeroInvalidoException("Número inválido");
        }
        return frase;
    }
}
