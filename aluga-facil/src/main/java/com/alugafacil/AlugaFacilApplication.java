package com.alugafacil;

import com.alugafacil.imovel.Imovel;
import com.alugafacil.proprietario.Proprietario;

import java.math.BigDecimal;

public class AlugaFacilApplication {
    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario("felix", "4691456156");

        proprietario.adicionaImovel(
                new Imovel(proprietario, "cajacity", BigDecimal.valueOf(420), 5, 8));

        proprietario.adicionaImovel(
                new Imovel(proprietario, "ondina", BigDecimal.valueOf(69420), 2, 6));

        System.out.println(proprietario);
        System.out.println(proprietario.quantidadeDeImoveis());
    }
}
