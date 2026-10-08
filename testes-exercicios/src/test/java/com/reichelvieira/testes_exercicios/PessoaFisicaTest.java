package com.reichelvieira.testes_exercicios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaFisicaTest {

    PessoaFisica pessoaFisica = new PessoaFisica("Eduardo", "11111111111", UF.SC, 0);

    @Test
    void deveLancarExcecaoQuandoARendaForNegativa() {

        pessoaFisica.setRendaAnual(-100);

        Assertions.assertThatThrownBy(() -> pessoaFisica.calculaImposto())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("A renda anual não pode ser negativa");
    }

    @Test
    void deveRetornarImpostoComAliquotaDeZeroPorCentoQuandoRendaAteQuatroMil() {
        pessoaFisica.setRendaAnual(4000);

        double impostoCobrado = pessoaFisica.calculaImposto();

        // 4000 * 0% = 0
        Assertions.assertThat(impostoCobrado).isEqualTo(0);
    }

    @Test
    void deveRetornarImpostoComAliquotaDeCincoPontoOitoPorCentoQuandoRendaAteNoveMil() {
        pessoaFisica.setRendaAnual(5000);

        double impostoCobrado = pessoaFisica.calculaImposto();

        // 5000 * 5.8% = 290
        Assertions.assertThat(impostoCobrado).isEqualTo(290);
    }

    @Test
    void deveRetornarImpostoComAliquotaDeQuinzePorCentoQuandoRendaAteVinteECincoMil() {
        pessoaFisica.setRendaAnual(20000);

        double impostoCobrado = pessoaFisica.calculaImposto();

        // 20000 * 15% = 3000
        Assertions.assertThat(impostoCobrado).isEqualTo(3000);
    }

    @Test
    void deveRetornarImpostoComAliquotaDeVinteSetePontoCincoPorCentoQuandoRendaAteTrintaECincoMil() {
        pessoaFisica.setRendaAnual(30000);

        double impostoCobrado = pessoaFisica.calculaImposto();

        // 30000 * 27.5% = 8250
        Assertions.assertThat(impostoCobrado).isEqualTo(8250);
    }

    @Test
    void deveRetornarImpostoComAliquotaDeTrintaPorCentoQuandoRendaAcimaDeTrintaECincoMil() {
        pessoaFisica.setRendaAnual(50000);

        double impostoCobrado = pessoaFisica.calculaImposto();

        // 50000 * 30% = 15000
        Assertions.assertThat(impostoCobrado).isEqualTo(15000);
    }
}
