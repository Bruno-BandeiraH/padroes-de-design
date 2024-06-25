package edu.brunobandeira.padroes_de_design.prototype.solucao;

import edu.brunobandeira.padroes_de_design.prototype.Botao;

public class TesteBotaoPrototype {

    public static void main(String[] args) {
        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);

        String chave = "BOTAO_PRETO";
        Botao botaoPreto = new Botao();
    }
}
