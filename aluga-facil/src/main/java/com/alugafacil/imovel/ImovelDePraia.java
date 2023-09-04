package com.alugafacil.imovel;

import com.alugafacil.proprietario.Proprietario;

import java.math.BigDecimal;

public class ImovelDePraia extends Imovel {
    private String nomeDaPraia;
    private BigDecimal distanciaAteAPraia;
    private boolean independente;

    public ImovelDePraia(
            Proprietario proprietario,
            String local,
            BigDecimal valor,
            int qntdQuartos,
            int comodos,
            String nomeDaPraia,
            BigDecimal distanciaAteAPraia,
            boolean independente) {
        super(proprietario, local, valor, qntdQuartos, comodos);
        this.nomeDaPraia = nomeDaPraia;
        this.distanciaAteAPraia = distanciaAteAPraia;
        this.independente = independente;
    }

    public String getNomeDaPraia() {
        return nomeDaPraia;
    }

    public BigDecimal getDistanciaAteAPraia() {
        return distanciaAteAPraia;
    }

    public boolean isIndependente() {
        return independente;
    }
}
