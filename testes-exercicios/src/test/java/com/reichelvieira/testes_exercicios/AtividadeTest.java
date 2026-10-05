package com.reichelvieira.testes_exercicios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AtividadeTest {

    @Test
    void deveRetornarTrueSeForParEFalseSeForImpar(){

        double num1 = 1;
        double num2 = 2;

        boolean retorno1 = Atividade.parOuImpar(num1);
        boolean retorno2 = Atividade.parOuImpar(num2);

        Assertions.assertThat(retorno1).isEqualTo(false);
        Assertions.assertThat(retorno2).isEqualTo(true);
    }
}
