package edu.brunobandeira.padroes_de_design.builder.solucao;

import edu.brunobandeira.padroes_de_design.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComBuilder {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Bruno")
                .sobreNome("Bandeira")
                .documento("77788899966")
                .email("bruno@email.com")
                .apelido("cabelo")
                .dataNascimento(LocalDate.of(1999,8,16))
                .build();

        System.out.println(pessoa);
    }
}
