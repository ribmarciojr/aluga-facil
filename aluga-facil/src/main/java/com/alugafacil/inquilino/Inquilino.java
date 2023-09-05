package com.alugafacil.inquilino;

import com.alugafacil.imovel.Imovel;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Inquilino {
    private final String nome;
    private final String cpf;
    private Set<Imovel> imoveis = new HashSet<>();

    public Inquilino(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public boolean alugaImovel(Imovel imovel) {
        Objects.requireNonNull(imovel, "Você precisa alugar um imóvel válido");
        // TODO: verificar se o imóvel está realmente disponível antes de settar como alugado ???
        
        if(imovel.getAgenciaStatus()){
            imovel.getAgencia().aumentarSaldo(imovel.getValor().multiply(imovel.getAgencia().getTaxa()));


        } else {
            imovel.getProprietario().aumentarSaldo(imovel.getValor());
        }

        imovel.setAlugado(true);
        return this.imoveis.add(imovel);
    }

    public void acessaNomesDosProprietariosDeImoveisAlugados() {
        for (Imovel imovel : this.imoveis) {
            System.out.println(imovel.getProprietario().getNome());
        }
    }

    @Override
    public String toString() {
        return "Inquilino{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", imoveis=" + imoveis +
                '}';
    }
}
