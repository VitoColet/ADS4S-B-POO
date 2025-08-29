package com.poo.vitor.projetoPoo.service;

import com.poo.vitor.projetoPoo.model.PessoaModel;
import com.poo.vitor.projetoPoo.repository.PessoaRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }


    public PessoaModel retornaPessoaPorId(Integer id){
        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("erro")
        );
    }

}
