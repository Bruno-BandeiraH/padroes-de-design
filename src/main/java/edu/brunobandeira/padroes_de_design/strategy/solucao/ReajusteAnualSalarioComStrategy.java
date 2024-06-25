package edu.brunobandeira.padroes_de_design.strategy.solucao;

import edu.brunobandeira.padroes_de_design.strategy.Funcionario;
import edu.brunobandeira.padroes_de_design.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalarioComStrategy {

    public void calculareajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador)
    {
        calculador.calcularReajusteAnual(funcionario);
    }
}
