package com.reichelvieira.testes_exercicios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AtividadeTest {

    @Test
    @DisplayName("Teste para retornar par ou ímpar dependendo do número inserido")
    void deveRetornarTrueSeForParEFalseSeForImpar(){

        double num1 = 1;
        double num2 = 2;

        boolean retorno1 = Atividade.parOuImpar(num1);
        boolean retorno2 = Atividade.parOuImpar(num2);

        Assertions.assertThat(retorno1).isEqualTo(false);
        Assertions.assertThat(retorno2).isEqualTo(true);
    }

    @Test
    void deveRetornarFraseDeEstacaoComBaseNoNumeroInserido(){

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;

        String retorno1 = Atividade.estacoesDoAno(num1);
        String retorno2 = Atividade.estacoesDoAno(num2);
        String retorno3 = Atividade.estacoesDoAno(num3);
        String retorno4 = Atividade.estacoesDoAno(num4);

        Assertions.assertThat(retorno1).isEqualTo("É verão\nE o tempo está quente.");
        Assertions.assertThat(retorno2).isEqualTo("É outono\nE as folhas caem.");
        Assertions.assertThat(retorno3).isEqualTo("É primavera\nE as flores nascem");
        Assertions.assertThat(retorno4).isEqualTo("É inverno\nE o tempo está frio");
    }

    @Test
    void deveRetornarExcecaoQuandoReceberNumeroDiferenteDe1A4(){
        int num = 5;

        Assertions.assertThatThrownBy(() -> Atividade.estacoesDoAno(num))
                .isInstanceOf(NumeroInvalidoException.class);
    }
}
