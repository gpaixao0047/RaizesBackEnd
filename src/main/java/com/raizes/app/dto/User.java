package com.raizes.app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {

    private String nome;

    private String sobrenome;

    private String telefone;

    private String email;

    private String cpf;

    private String rg;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dataNascimento;

    private Integer idade;

    private String endereco;

    private String cep;

    private String cidade;

    private String pais;

}
