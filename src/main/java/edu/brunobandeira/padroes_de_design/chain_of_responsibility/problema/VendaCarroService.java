package edu.brunobandeira.padroes_de_design.chain_of_responsibility.problema;

import edu.brunobandeira.padroes_de_design.chain_of_responsibility.Carro;
import edu.brunobandeira.padroes_de_design.chain_of_responsibility.Marca;

import javax.swing.*;
import java.math.BigDecimal;

public class VendaCarroService {

    public BigDecimal calculaValorVenda(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();

        if(Marca.FIAT.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(1000));
        }

        if(Marca.FORD.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(2000));
        }

        if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0){
            return valorVenda.subtract(new BigDecimal(10000));
        }

        return valorVenda;
    }

}
