package edu.brunobandeira.padroes_de_design.factoryMethod.solucao;

import edu.brunobandeira.padroes_de_design.factoryMethod.Produto;
import edu.brunobandeira.padroes_de_design.factoryMethod.ProdutoDigital;
import edu.brunobandeira.padroes_de_design.factoryMethod.ProdutoFisico;
import edu.brunobandeira.padroes_de_design.factoryMethod.TipoProdutoEnum;

public class ProdutoFactory {

    public static Produto getInstance(TipoProdutoEnum tipoProduto){

        switch (tipoProduto){
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;
            default:
                throw new IllegalArgumentException("Tipo de produto não disponível");
        }

    }
}
