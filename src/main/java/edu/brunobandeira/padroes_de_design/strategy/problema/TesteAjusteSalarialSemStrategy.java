package edu.brunobandeira.padroes_de_design.strategy.problema;

import edu.brunobandeira.padroes_de_design.strategy.Funcionario;
import edu.brunobandeira.padroes_de_design.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class TesteAjusteSalarialSemStrategy {

    public static void main(String[] args) {
        ReajusteAnualSalario reajusteAnualSalario = new ReajusteAnualSalario();
        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Fernando");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Junior");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(10000));

        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setNome("Bruno");
        funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setSalario(new BigDecimal(2000));

        // Reajustes
        reajusteAnualSalario.calculareajusteAnual(funcionarioCLT);
        reajusteAnualSalario.calculareajusteAnual(funcionarioPJ);
        reajusteAnualSalario.calculareajusteAnual(funcionarioEstagio);

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
    }
}
