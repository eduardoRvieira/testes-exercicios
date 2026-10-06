package com.reichelvieira.testes_exercicios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void deveReceberDadosDaPessoaERetornarNomeEmStarWars(){

        Pessoa pessoa = new Pessoa("Eduardo", "Reichel", "Reichel", "Blumenau");

        String nomeSW = pessoa.gerarNomeSW();

        Assertions.assertThat(nomeSW).isEqualTo("Reied Reblu");
    }
}
