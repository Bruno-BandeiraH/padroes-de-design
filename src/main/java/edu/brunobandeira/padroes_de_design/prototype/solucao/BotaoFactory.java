package edu.brunobandeira.padroes_de_design.prototype.solucao;

import edu.brunobandeira.padroes_de_design.prototype.Botao;

public class BotaoFactory {
    public static Botao getInstance(Botao prototipo) {

        Botao clone = new Botao();
        clone.setCor(prototipo.getCor());
        clone.setLargura(prototipo.getLargura());
        clone.setAltura(prototipo.getAltura());
        clone.setTipoBorda(prototipo.getTipoBorda());
        return clone;

    }
}
