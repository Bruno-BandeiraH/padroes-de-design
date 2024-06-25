package edu.brunobandeira.padroes_de_design.adapter;

public class SDParaUSBAdapter implements  LeitorUSB{

    private LeitorDeCartaoSD leitorDeCartaoSD;

    public SDParaUSBAdapter(LeitorDeCartaoSD leitorDeCartaoSD) {
        this.leitorDeCartaoSD = leitorDeCartaoSD;
    }

    @Override
    public void lerUSB() {
        leitorDeCartaoSD.lerSD();
    }
}
