package com.alugafacil.imovel;

import static org.junit.jupiter.api.Assertions.*;

import com.alugafacil.proprietario.Proprietario;

import net.jqwik.api.ForAll;
import net.jqwik.api.Label;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.AlphaChars;
import net.jqwik.api.constraints.BigRange;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.StringLength;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

class ImovelTest {
    private Proprietario proprietario = new Proprietario("fulano", "cpf");

    @Label("proprietario deve poder vincular imovel comum e imovel de praia")
    @Property(tries = 10)
    void test(
            @ForAll @AlphaChars @StringLength(min = 1, max = 255) String endereco,
            @ForAll @BigRange(min = "200", max = "5000") BigDecimal valor,
            @ForAll @IntRange(min = 1) int qntdQuartos,
            @ForAll @IntRange(min = 1) int comodos,
            @ForAll @AlphaChars @StringLength(min = 1, max = 255) String nomeDaPraia,
            @ForAll @BigRange(min = "1", max = "100") BigDecimal distanciaAteAPraia,
            @ForAll boolean independente) {
        var imovel = new Imovel(proprietario, endereco, valor, qntdQuartos, comodos);
        var imovelDePraia =
                new ImovelDePraia(
                        proprietario,
                        endereco,
                        valor,
                        qntdQuartos,
                        comodos,
                        nomeDaPraia,
                        distanciaAteAPraia,
                        independente);

        Assertions.assertTrue(proprietario.adicionaImovel(imovel));
        Assertions.assertTrue(proprietario.adicionaImovel(imovelDePraia));
    }
}
