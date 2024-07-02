package edu.brunobandeira.padroes_de_design.chain_of_responsibility.solucao;

import edu.brunobandeira.padroes_de_design.chain_of_responsibility.Carro;
import edu.brunobandeira.padroes_de_design.chain_of_responsibility.Marca;

import java.math.BigDecimal;

public class DescontoCarroFORD extends DescontoCarro{
    public DescontoCarroFORD(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if(Marca.FORD.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(2000));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
