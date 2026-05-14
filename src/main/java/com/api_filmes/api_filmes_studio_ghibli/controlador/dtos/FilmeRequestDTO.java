package com.api_filmes.api_filmes_studio_ghibli.controlador.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FilmeRequestDTO(

        @NotBlank
        String nome,

        @NotBlank
        String sobre,

        @NotBlank
        String sinopse,

        @NotNull
        Integer anoLancamento,

        @NotNull
        @Min(1)
        Integer duracao,

        @NotBlank
        String genero
) {
}