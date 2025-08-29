package com.poo.vitor.projetoPoo.repository;

import com.poo.vitor.projetoPoo.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Integer> {

}
