package edu.brunobandeira.padroes_de_design.adapter;

public class TesteAdapter {
    public static void main(String[] args) {
        LeitorDeCartaoSD leitorDeCartaoSD = new LeitorDeCartaoSD();
        LeitorUSB leitorUSB = new SDParaUSBAdapter(leitorDeCartaoSD);

        leitorUSB.lerUSB();
    }
}
