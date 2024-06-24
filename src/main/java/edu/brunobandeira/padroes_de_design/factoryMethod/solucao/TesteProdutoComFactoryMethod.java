package edu.brunobandeira.padroes_de_design.factoryMethod.solucao;

import edu.brunobandeira.padroes_de_design.factoryMethod.Produto;
import edu.brunobandeira.padroes_de_design.factoryMethod.TipoProdutoEnum;

public class TesteProdutoComFactoryMethod {
    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);
    }
}
