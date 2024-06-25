package edu.brunobandeira.padroes_de_design.proxy.solucao;

import edu.brunobandeira.padroes_de_design.builder.Pessoa;
import edu.brunobandeira.padroes_de_design.proxy.PessoaService;

import java.time.LocalDate;

public class TestePessoaComProxy {

    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService(new PessoaRepositoryProxy());

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
    }
}
