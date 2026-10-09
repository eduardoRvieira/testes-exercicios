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
        if (num <= 0 || num >=5){
            throw new NumeroInvalidoException("Número inválido");
        }

        String frase = switch (num){
            case 1 -> "É verão\nE o tempo está quente.";
            case 2 -> "É outono\nE as folhas caem.";
            case 3 -> "É primavera\nE as flores nascem";
            case 4 -> "É inverno\nE o tempo está frio";
            default -> null;
        };

        return frase;

        /*String frase = "";

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
        return frase;*/
    }
}
