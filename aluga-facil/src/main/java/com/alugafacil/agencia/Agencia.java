package com.alugafacil.agencia;

import java.math.BigDecimal;

public class Agencia {
    private String nome;
    private BigDecimal taxa; 
    private BigDecimal saldo;

    public Agencia(String name, BigDecimal tax){
        this.nome = name;
        this.taxa = tax;
    }

    public String getNome(){
        return this.nome;
    }

    public BigDecimal getTaxa(){
        return this.taxa; // 0.02
    }

    public void aumentarSaldo(BigDecimal saldo){
        this.saldo.add(saldo);
    }

}
