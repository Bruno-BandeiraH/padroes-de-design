package edu.brunobandeira.padroes_de_design.proxy.solucao;

import edu.brunobandeira.padroes_de_design.builder.Pessoa;
import edu.brunobandeira.padroes_de_design.proxy.PessoaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository{

    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private Map<Long, Pessoa> cache = new HashMap<>();

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada do método save. . .");
        super.save(pessoa);
        log.info("Chamada do metodo save finalizada.");
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamada do método findById. . .");

        Pessoa pessoa = null;

        if(Objects.nonNull(cache.get(id))){
            log.info("Está pegando do cache");
            pessoa = cache.get(id);
        } else {
            log.info("Esta pegando do PessoaRepositoryProxy");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }

            log.info("Chamada do metodo findById finalizada.");
            return pessoa;
    }
}
