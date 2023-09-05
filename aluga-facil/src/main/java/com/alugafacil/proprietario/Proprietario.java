package com.alugafacil.proprietario;

import com.alugafacil.imovel.Imovel;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Proprietario {
    private final String nome;
    private final String cpf;
    private Set<Imovel> imoveis = new HashSet<>();
    private BigDecimal saldo;


    public Proprietario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void aumentarSaldo(BigDecimal saldo){
        this.saldo.add(saldo);
    }


    public boolean adicionaImovel(Imovel imovel) {
        Objects.requireNonNull(imovel, "Você precisa adicionar um imóvel válido");
        return this.imoveis.add(imovel);
    }

    public boolean removeImovel(Imovel imovel) {
        Objects.requireNonNull(imovel, "Você precisa remover um imóvel válido");
        /*
         * Não se pode remover um imóvel que não esteja assoaciado a este proprietário
         * */
        if (!imovel.getProprietario().equals(this)) {
            throw new IllegalArgumentException("...");
        }
        return this.imoveis.remove(imovel);
    }

    public int quantidadeDeImoveis() {
        return this.imoveis.size();
    }

    public boolean imovelJaFoiAlugado(Imovel imovel) {
        Objects.requireNonNull(imovel, "Consulte um imóvel válido");
        if (!imovel.getProprietario().equals(this)) {
            throw new IllegalArgumentException("Imóvel não pertence ao este proprietário");
        }
        return imovel.isAlugado();
    }

    public String getNome() {
        return nome;
    }

    public Set<Imovel> getImoveis() {
        return imoveis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proprietario that = (Proprietario) o;
        return Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf);
    }

    @Override
    public String toString() {
        return "Proprietario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", imoveis=" + imoveis +
                '}';
    }
}
