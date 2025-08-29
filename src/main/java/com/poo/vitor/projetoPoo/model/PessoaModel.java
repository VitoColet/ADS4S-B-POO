package com.poo.vitor.projetoPoo.model;

import jakarta.persistence.*;

@Entity
@Table (name = "pessoa")
public class PessoaModel {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    private String cpf;

    private int idade;

}
