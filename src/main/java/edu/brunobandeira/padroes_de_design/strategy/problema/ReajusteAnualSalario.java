package edu.brunobandeira.padroes_de_design.strategy.problema;

import edu.brunobandeira.padroes_de_design.strategy.Funcionario;
import edu.brunobandeira.padroes_de_design.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalario {

    public void calculareajusteAnual(Funcionario funcionario)
    {
        if  (TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name()))
        {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
        } else if (TipoContratacaoEnum.PJ.name().equals(funcionario.getTipoContratacao().name()))
        {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
        } else if (TipoContratacaoEnum.ESTAGIO.name().equals(funcionario.getTipoContratacao().name()))
        {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
        }
    }
}
