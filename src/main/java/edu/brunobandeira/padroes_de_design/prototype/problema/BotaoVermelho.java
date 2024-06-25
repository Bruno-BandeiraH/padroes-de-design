package edu.brunobandeira.padroes_de_design.prototype.problema;

import edu.brunobandeira.padroes_de_design.prototype.Botao;
import edu.brunobandeira.padroes_de_design.prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {

    public BotaoVermelho() {
        setCor("Vermelho");
        setAltura(30);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
