package edu.brunobandeira.padroes_de_design.chain_of_responsibility.solucao;

import edu.brunobandeira.padroes_de_design.chain_of_responsibility.Carro;

import java.math.BigDecimal;

public class DescontoCarroSemDireitoADesconto extends DescontoCarro{
    public DescontoCarroSemDireitoADesconto(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }
}
