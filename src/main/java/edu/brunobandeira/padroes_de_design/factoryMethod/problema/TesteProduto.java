package edu.brunobandeira.padroes_de_design.factoryMethod.problema;

import edu.brunobandeira.padroes_de_design.factoryMethod.ProdutoDigital;
import edu.brunobandeira.padroes_de_design.factoryMethod.ProdutoFisico;

public class TesteProduto {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
