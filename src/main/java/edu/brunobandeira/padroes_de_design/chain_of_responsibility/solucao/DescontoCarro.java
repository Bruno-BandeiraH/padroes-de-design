package edu.brunobandeira.padroes_de_design.chain_of_responsibility.solucao;

import edu.brunobandeira.padroes_de_design.chain_of_responsibility.Carro;

import java.math.BigDecimal;

public abstract class DescontoCarro {

    protected  DescontoCarro proximoDesconto;

    public DescontoCarro(DescontoCarro proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public abstract BigDecimal aplicaDesconto(Carro carro);
}
