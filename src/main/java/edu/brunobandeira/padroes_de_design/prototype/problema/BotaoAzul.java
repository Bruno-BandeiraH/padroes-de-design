package edu.brunobandeira.padroes_de_design.prototype.problema;

import edu.brunobandeira.padroes_de_design.prototype.Botao;
import edu.brunobandeira.padroes_de_design.prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {

    public BotaoAzul() {
        setCor("Azul");
        setAltura(35);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
