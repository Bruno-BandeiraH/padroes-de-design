package edu.brunobandeira.padroes_de_design.proxy;

import edu.brunobandeira.padroes_de_design.builder.Pessoa;
import edu.brunobandeira.padroes_de_design.proxy.solucao.PessoaRepositoryProxy;

public class PessoaService {

    private PessoaRepositoryProxy pessoaRepositoryProxy;

    public PessoaService(PessoaRepositoryProxy pessoaRepositoryProxy) {
        this.pessoaRepositoryProxy = pessoaRepositoryProxy;
    }

    public void save(Pessoa pessoa) {
        pessoaRepositoryProxy.save(pessoa);
    }

    public Pessoa findById(Long id){
        return pessoaRepositoryProxy.findById(id);
    }

}
