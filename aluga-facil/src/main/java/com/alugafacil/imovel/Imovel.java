package com.alugafacil.imovel;

import com.alugafacil.proprietario.Proprietario;

import java.math.BigDecimal;
import java.util.Objects;

public class Imovel {
    private Proprietario proprietario;
    private String endereco; // TODO: trabalhar com objeto 'Endereco'?
    private BigDecimal valor;
    private int qntdQuartos;
    private int comodos;
    private boolean alugado = false;

    public Imovel(String local, BigDecimal valor, int qntdQuartos, int comodos) {
        this.endereco = local;
        this.valor = valor;
        this.qntdQuartos = qntdQuartos;
        this.comodos = comodos;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imovel imovel = (Imovel) o;
        return qntdQuartos == imovel.qntdQuartos
                && comodos == imovel.comodos
                && alugado == imovel.alugado
                && Objects.equals(endereco, imovel.endereco)
                && Objects.equals(valor, imovel.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endereco, valor, qntdQuartos, comodos, alugado);
    }
}
