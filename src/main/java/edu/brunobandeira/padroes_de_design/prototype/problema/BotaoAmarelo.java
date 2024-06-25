package edu.brunobandeira.padroes_de_design.prototype.problema;

import edu.brunobandeira.padroes_de_design.prototype.Botao;
import edu.brunobandeira.padroes_de_design.prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {

    public BotaoAmarelo() {
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
