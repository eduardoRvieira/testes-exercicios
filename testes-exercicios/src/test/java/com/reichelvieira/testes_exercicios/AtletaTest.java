package com.reichelvieira.testes_exercicios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AtletaTest {

    Atleta a = new Atleta();

    @Test

    void deveRetornarIdadeInvalidaQuandoIdadeForMenorQue5(){
        a.setIdade(4);
        String categoria = a.classificaCategoriaIdade();
        Assertions.assertThat(categoria).isEqualTo("Idade Inválida");
    }

    @Test
    void deveRetornarPreMirimQuandoIdadeForLimiteInferior5(){
        a.setIdade(5);
        String categoria = a.classificaCategoriaIdade();
        Assertions.assertThat(categoria).isEqualTo("Pré-mirim");
    }

    @Test
    void deveRetornarPreMirimQuandoIdadeForLimiteSuperior7(){
        a.setIdade(7);
        String categoria = a.classificaCategoriaIdade();
        Assertions.assertThat(categoria).isEqualTo("Pré-mirim");
    }

    @Test
    void deveRetornarMirimQuandoIdadeForDentroDaFaixa8(){
        a.setIdade(8);
        String categoria = a.classificaCategoriaIdade();
        Assertions.assertThat(categoria).isEqualTo("Mirim");
    }

    @Test
    void deveRetornarMirimQuandoIdadeForLimiteSuperior10(){
        a.setIdade(10);
        String categoria = a.classificaCategoriaIdade();
        Assertions.assertThat(categoria).isEqualTo("Mirim");
    }

    @Test
    void deveRetornarInfantilQuandoIdadeForDentroDaFaixa11(){
        a.setIdade(11);
        String categoria = a.classificaCategoriaIdade();
        Assertions.assertThat(categoria).isEqualTo("Infantil");
    }

    @Test
    void deveRetornarInfantilQuandoIdadeForLimiteSuperior13(){
        a.setIdade(13);
        String categoria = a.classificaCategoriaIdade();
        Assertions.assertThat(categoria).isEqualTo("Infantil");
    }

    @Test
    void deveRetornarInfantoJuvenilQuandoIdadeForDentroDaFaixa14(){
        a.setIdade(14);
        String categoria = a.classificaCategoriaIdade();
        Assertions.assertThat(categoria).isEqualTo("Infanto-juvenil");
    }

    @Test
    void deveRetornarInfantoJuvenilQuandoIdadeForLimiteSuperior17(){
        a.setIdade(17);
        String categoria = a.classificaCategoriaIdade();
        Assertions.assertThat(categoria).isEqualTo("Infanto-juvenil");
    }

    @Test
    void deveRetornarJuvenilQuandoIdadeForDentroDaFaixa18(){
        a.setIdade(18);
        String categoria = a.classificaCategoriaIdade();
        Assertions.assertThat(categoria).isEqualTo("Juvenil");
    }

    @Test
    void deveRetornarJuvenilQuandoIdadeForLimiteSuperior20(){
        a.setIdade(20);
        String categoria = a.classificaCategoriaIdade();
        Assertions.assertThat(categoria).isEqualTo("Juvenil");
    }

    @Test
    void deveRetornarAdultosMaioresQue21AnosQuandoIdadeForMaiorOuIgualA21(){
        a.setIdade(21);
        String categoria = a.classificaCategoriaIdade();
        Assertions.assertThat(categoria).isEqualTo("Adultos maiores que 21 anos");
    }

    @Test
    void deveRetornarMagrezaQuandoIMCOfMenorQueDezoitoPontoCinco(){
        a.setPeso(72.0);
        a.setAltura(2.0);
        String categoria = a.classificaIMC();
        Assertions.assertThat(categoria).isEqualTo("Magreza");
    }

    @Test
    void deveRetornarSaudavelQuandoIMCOfEntreDezoitoPontoCincoEVinteQuatroPontoNove(){
        a.setPeso(88.0);
        a.setAltura(2.0);
        String categoria = a.classificaIMC();
        Assertions.assertThat(categoria).isEqualTo("Saudável");
    }

    @Test
    void deveRetornarSobrepesoQuandoIMCOfEntreVinteQuatroPontoNoveEVinteNovePontoNove(){
        a.setPeso(108.0);
        a.setAltura(2.0);
        String categoria = a.classificaIMC();
        Assertions.assertThat(categoria).isEqualTo("Sobrepeso");
    }

    @Test
    void deveRetornarObesidadeGrauIQuandoIMCOfEntreVinteNovePontoNoveETrintaQuatroPontoNove(){
        a.setPeso(128.0);
        a.setAltura(2.0);
        String categoria = a.classificaIMC();
        Assertions.assertThat(categoria).isEqualTo("Obesidade Grau I");
    }

    @Test
    void deveRetornarObesidadeGrauIIQuandoIMCOfEntreTrintaQuatroPontoNoveETrintaNovePontoNove(){
        a.setPeso(148.0);
        a.setAltura(2.0);
        String categoria = a.classificaIMC();
        Assertions.assertThat(categoria).isEqualTo("Obesidade Grau II");
    }

    @Test
    void deveRetornarObesidadeMorbidaQuandoIMCOfMaiorOuIgualATrintaNovePontoNove(){
        a.setPeso(168.0);
        a.setAltura(2.0);
        String categoria = a.classificaIMC();
        Assertions.assertThat(categoria).isEqualTo("Obesidade Morbida");
    }
}
