package com.alugafacil.imovel;

import com.alugafacil.proprietario.Proprietario;

import java.math.BigDecimal;
import java.util.Objects;

public class Imovel {
    private Proprietario proprietario;
    private String endereco;
    private BigDecimal valor;
    private int qntdQuartos;
    private int comodos;
    private boolean alugado = false;

    public Imovel(
            Proprietario proprietario,
            String endereco,
            BigDecimal valor,
            int qntdQuartos,
            int comodos) {
        this.proprietario = proprietario;
        this.endereco = endereco;
        this.valor = valor;
        this.qntdQuartos = qntdQuartos;
        this.comodos = comodos;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
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

    @Override
    public String toString() {
        return "Imovel{" +
                "endereco='" + endereco + '\'' +
                ", valor=" + valor +
                ", qntdQuartos=" + qntdQuartos +
                ", comodos=" + comodos +
                ", alugado=" + alugado +
                '}';
    }
}
