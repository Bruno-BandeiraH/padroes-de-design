package edu.brunobandeira.padroes_de_design.chain_of_responsibility.solucao;

import edu.brunobandeira.padroes_de_design.chain_of_responsibility.Carro;
import edu.brunobandeira.padroes_de_design.chain_of_responsibility.Marca;

import java.math.BigDecimal;

public class DescontoCarroMaiorQueCemMil extends DescontoCarro{
    public DescontoCarroMaiorQueCemMil(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0){
            return valorVenda.subtract(new BigDecimal(10000));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
