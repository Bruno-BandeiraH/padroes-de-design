package edu.brunobandeira.padroes_de_design.singleton.solucao;

import edu.brunobandeira.padroes_de_design.singleton.problema.Agenda;

public class TesteAgendaSingleton {

    public static void main(String[] args) {
       /*reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sabado");*/

        //reservaDiaLAZY("Sexta");
        //reservaDiaLAZY("Sabado");

        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sabado");
    }

    public static void reservaDiaEAGER(String dia) {
       AgendaSingletonEAGER agenda =  AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaLAZY(String dia) {
        AgendaSingletonLAZY agenda =  AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaEnum(String dia) {
        AgendaSingletonEnum agenda =  AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }




}
