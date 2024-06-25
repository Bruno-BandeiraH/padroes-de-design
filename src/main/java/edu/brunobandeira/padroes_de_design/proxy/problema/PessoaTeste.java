package edu.brunobandeira.padroes_de_design.proxy.problema;

import edu.brunobandeira.padroes_de_design.builder.Pessoa;
import edu.brunobandeira.padroes_de_design.builder.solucao.PessoaBuilder;
import edu.brunobandeira.padroes_de_design.proxy.PessoaRepository;
import edu.brunobandeira.padroes_de_design.proxy.PessoaService;

import java.time.LocalDate;

public class PessoaTeste {
/*
    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService(new PessoaRepository());

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Bruno")
                .sobreNome("Bandeira")
                .apelido("Rivotril")
                .documento("77788899945")
                .dataNascimento(LocalDate.of(1999,8,16))
                .email("bruno@email.com")
                .build();

        pessoaService.save(pessoa);
        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);
    }*/
}
