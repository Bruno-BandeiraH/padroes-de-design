package edu.brunobandeira.padroes_de_design.chain_of_responsibility.solucao;

import edu.brunobandeira.padroes_de_design.chain_of_responsibility.Carro;
import edu.brunobandeira.padroes_de_design.chain_of_responsibility.Marca;

import java.math.BigDecimal;

public class VendaCarroServiceComChainOfResponsibility {

    public BigDecimal calculaValorVenda(Carro carro) {
        DescontoCarro desconto =
                new DescontoCarroFIAT(
                        new DescontoCarroFORD(
                                new DescontoCarroMaiorQueCemMil(
                                        new DescontoCarroSemDireitoADesconto(null)
                                )
                        )
                );
        return desconto.aplicaDesconto(carro);
    }

}
