package edu.brunobandeira.padroes_de_design.strategy.solucao;

import edu.brunobandeira.padroes_de_design.strategy.Funcionario;
import edu.brunobandeira.padroes_de_design.strategy.TipoContratacaoEnum;
import edu.brunobandeira.padroes_de_design.strategy.problema.ReajusteAnualSalario;

import java.math.BigDecimal;

public class TesteAjusteSalarialComStrategy {

    public static void main(String[] args) {
        ReajusteAnualSalarioComStrategy reajusteAnualSalario = new ReajusteAnualSalarioComStrategy();
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
        reajusteAnualSalario.calculareajusteAnual(funcionarioCLT, new CalculadorReajusteAnualSalarioCLT());
        reajusteAnualSalario.calculareajusteAnual(funcionarioPJ, new CalculadorReajusteAnualSalarioPJ());
        reajusteAnualSalario.calculareajusteAnual(funcionarioEstagio, new CalculadorReajusteAnualSalarioEstagio());

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
    }
}
